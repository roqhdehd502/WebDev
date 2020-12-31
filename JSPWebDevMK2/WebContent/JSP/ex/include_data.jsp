<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>include_data</title>
</head>
<body>
	<%
		String dan = request.getParameter("dan");
		int temp = Integer.parseInt(dan);
		out.println(temp + "단<br>");
		for(int i = 1; i <= 9; i++) {
			out.println(temp + "*" + i + "=" + (temp*i));
		}
	%>
</body>
</html>