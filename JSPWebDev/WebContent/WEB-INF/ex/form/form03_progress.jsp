<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>form03_progress</title>
</head>
<body>
	<%
		String[] fruit = request.getParameterValues("fruit");
	%>
	<h4>선택한 과일</h4>
	<%
		for(int i = 0; i < fruit.length; i++) {
			out.println(fruit[i]);
		}
	%>
</body>
</html>