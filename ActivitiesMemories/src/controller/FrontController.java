package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.BoardListCommand;
import command.BoardWriteCommand;
import command.Command;
import command.ContentViewCommand;
import command.DeleteCommand;
import command.ModifyCommand;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메소드");
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 메소드");
		actionDo(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo 메소드");
		
		request.setCharacterEncoding("UTF-8");
		
		String viewPage = null;
		Command command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		System.out.println("uri: " + uri);
		System.out.println("conPath: " + conPath);
		System.out.println("com: " + com);
		
		if (com.equals("/boardList.do")) {
			command = new BoardListCommand();
			command.execute(request, response);
			viewPage = "Board/boardList.jsp";
		} else if (com.equals("/contentView.do")) {
			command = new ContentViewCommand();
			command.execute(request, response);
			viewPage = "Board/contentView.jsp";
		} else if (com.equals("/modify.do")) {
			command = new ModifyCommand();
			command.execute(request, response);
			viewPage = "boardList.do";
		} else if (com.equals("/delete.do")) {
			command = new DeleteCommand();
			command.execute(request, response);
			viewPage = "boardList.do";
		} else if (com.equals("/boardWriteView.do")) {
			viewPage = "Board/writeView.jsp";
		} else if (com.equals("/boardWrite.do")) {
			command = new BoardWriteCommand();
			command.execute(request, response);
			viewPage = "boardList.do";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}