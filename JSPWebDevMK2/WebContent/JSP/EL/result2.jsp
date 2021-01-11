<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${applicationScope.application_name}<br>
	${sessionScope.session_name}<br>
	${requestScope.request_name}<br>
	${pageScope.page_name}<br>
</body>
</html>