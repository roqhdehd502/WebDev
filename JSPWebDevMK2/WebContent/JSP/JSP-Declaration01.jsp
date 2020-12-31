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
		int i = 10;
		String str = "ABCDE";
	%>
	
	<%!
		public int sum(int a, int b) {
			return a+b;
		}
	%>
	
	<%
		out.println("i = " + i + "<br>");
		out.println("str = " + str + "<br>");
		out.println("sum = " + sum(1, 5) + "<br>");
	%>
</body>
</html>