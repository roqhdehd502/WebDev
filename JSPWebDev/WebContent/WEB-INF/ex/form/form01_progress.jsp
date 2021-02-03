<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>form01_progress</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String email = request.getParameter("email");
		
		out.println("아이디: " + name + "<br>");
		out.println("주소: " + addr + "<br>");
		out.println("이메일: " + email + "<br>");
	%>
</body>
</html>