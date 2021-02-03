<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>include</title>
</head>
<body>
	<h4>구구단 출력하기</h4>
	<jsp:include page="gugudan03_include02.jsp">
		<jsp:param value="5" name="dan"/>
	</jsp:include>
</body>
</html>