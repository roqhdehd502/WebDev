package edu.bit.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuGuServlet
 */
@WebServlet("/GuGu")
public class GuGuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GuGuServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dan = request.getParameter("dan");

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();

		writer.println("<html><head></head><body><table border=\"1\">");
		writer.println("<tr><td>" + dan + "단</td><tr>");
		for (int i = 1; i <= 9; i++) 
			writer.println("<tr><td>" + dan + " * " + i + " = " + (Integer.parseInt(dan)*i) + "</td></tr>");
		writer.println("</table>");
		writer.println("<button onclick=\"window.location.href='http://localhost:8282/JSPWebDevMK2/CSS/ex/Gugudan.html'\">돌아가기</button>");
		writer.println("</body></html>");
	}
}
