<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<%!
		String name, id, pw, major, protocol;
		String[] hobbys;
	%>
	
	<% 
		name = request.getParameter("name");
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		major = request.getParameter("major");
		protocol = request.getParameter("protocol");
		hobbys = request.getParameterValues("hobbys");
	%>
	
	이름 : <%=name%><br>
	ID : <%=id%><br>
	PW : <%=pw%><br>
	취미 : <%=Arrays.toString(hobbys)%><br>
	전공 : <%=major%><br>
	프로토콜 : <%=protocol%><br>
</body>
</html>