package edu.bit.ex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.command.BCommand;
import edu.bit.ex.command.BContentCommand;
import edu.bit.ex.command.BDeleteCommand;
import edu.bit.ex.command.BListCommand;
import edu.bit.ex.command.BWriteCommand;

/**
 * Servlet implementation class BFrontController
 */
@WebServlet("*.do") // 모델 내 여러 커멘드를 하나의 컨트롤러로 로직 실행을 지시한다.
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}
	
	// 액션 메소드
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		
		request.setCharacterEncoding("EUC-KR");
		
		String viewPage = null;
		BCommand command = null;
		
		// uri 요청
		String uri = request.getRequestURI();
		// 경로 요청
		String conPath = request.getContextPath();
 
		// 요청한 경로를 본 길이만큼 자른다.(서블릿내 매핑한 것으로)
		String com = uri.substring(conPath.length());
		
		// 요청했던 데이터들을 콘솔에 출력
		System.out.println(uri);
	    System.out.println(conPath);
	    System.out.println(com);

		
		// 해당 경로가 본 서블릿 매핑 경로와 일치할경우
		if (com.equals("/list.do")) { 
			command = new BListCommand(); // 커맨드 리스트 객체에 담는다.			
			command.execute(request, response); // 요청 및 응답 객체를 담아 커맨드 리스트를 실행한다.		
			viewPage = "list.jsp"; // Controller -> View로 응답한다.
		} else if(com.equals("/content_view.do")) {
			command = new BContentCommand();
			command.execute(request, response);
			viewPage = "content_view.jsp"; // 글내용 페이지로 간다
		} else if(com.equals("/write_view.do")) {
			viewPage = "write_view.jsp"; // 글쓰기 페이지로 바로 간다
		} else if(com.equals("/write.do")) {
			command = new BWriteCommand();
			command.execute(request, response);
			viewPage = "list.do"; // 글쓰기가 완료되면 list페이지로 간다
		} else if(com.equals("/delete.do")) {
			command = new BDeleteCommand();
			command.execute(request, response);
			viewPage = "list.do"; // 삭제가 완료되면 list페이지로 이동한다.
		}
		
		// 디스패쳐 객체로 viewPage를 담아 요청한다.
		// 클라이언트가 요청하면서 전송한 데이터를 그대로 유지할 수 있다.
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		// 인증이 완료되면 포워딩을 한다.
		dispatcher.forward(request, response);
	}
}