<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>구구단을 나열하자!</title>
</head>
<body>
	<table border="1">
	<%
		for (int i = 2; i <= 9; i++) {
			out.println("<tr>");
			for (int j = 1; j <= 9; j++) {
				out.println("<td>" + i + "*" + j + "=" + i*j + "</td>");
			}
			out.println("</tr>");
		}
	%>
	</table>
</body>
</html>