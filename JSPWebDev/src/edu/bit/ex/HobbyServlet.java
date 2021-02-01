package edu.bit.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HobbyServlet
 */
@WebServlet("/HS")
public class HobbyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HobbyServlet() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 입니다.");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy 입니다.");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 입니다.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 입니다.");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String[] hb = request.getParameterValues("hb");
		String subject = request.getParameter("subject");
		String protocol = request.getParameter("protocol");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("<h1>아이디 : " + id + "</h1>");
		writer.println("<h1>비밀번호 : " + pw + "</h1>");
		writer.print("<h1>취미 : ");
		for (int i = 0; i < hb.length; i++) {
			writer.print(hb[i] + " ");
		}
		writer.println("</h1>");
		writer.println("<h1>전공 : " + subject + "</h1>");
		writer.println("<h1>프로토콜 : " + protocol + "</h1>");
		writer.println("</body></html>");
	}
}