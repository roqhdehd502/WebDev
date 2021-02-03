<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>성적을 입력해보자!</title>
	
	<style type="text/css">
		table {
			border-collapse: collapse;
			border-color: blue;
			color: blue;
		}
	</style>
</head>
<body>
	<form action="OutputInfo.jsp" method="post">
		<table border="1">
			<tr>
				<td colspan="2">학번
				<td><input type = "text" name = "classNum">
			</tr>
			<tr>
				<td rowspan="4">과목
			</tr>
			<tr>
				<td>Java
				<td><input type = "text" name = "javaScore">
			</tr>
			<tr>
				<td>Database
				<td><input type = "text" name = "dbScore">
			</tr>
			<tr>
				<td>JSP
				<td><input type = "text" name = "jspScore">
			</tr>
			<tr>
				<td colspan="3" width="100px"><input type="submit" value="전송">
			</tr>
		</table>
	</form>
</body>
</html>