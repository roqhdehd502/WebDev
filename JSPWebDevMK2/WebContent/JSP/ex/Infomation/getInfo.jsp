<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Your Information</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String[] hb = request.getParameterValues("hb");
		String subject = request.getParameter("subject");
		String protocol = request.getParameter("protocol");
		
		response.setContentType("text/html; charset=UTF-8");
		
			out.println("<html><head></head><body>");
			out.println("<h1>아이디 : " + id + "</h1>");
			out.println("<h1>비밀번호 : " + pw + "</h1>");
			out.print("<h1>취미 : ");
			for (int i = 0; i < hb.length; i++) {
				out.print(hb[i] + " ");
			}
			out.println("</h1>");
			out.println("<h1>전공 : " + subject + "</h1>");
			out.println("<h1>프로토콜 : " + protocol + "</h1>");
	%>
</body>
</html>