<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<%
		String age = request.getParameter("age");
		int temp = Integer.parseInt(age);
		
		if(temp >= 19) {
			response.sendRedirect("pass.jsp");
		} else {
			response.sendRedirect("reject.jsp");
		}
	%>
</body>
</html>