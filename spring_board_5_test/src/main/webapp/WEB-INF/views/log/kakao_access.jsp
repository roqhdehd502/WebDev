<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Welcome To Main!</title>
</head>
<body>
	<p>환영합니다.</p>

	<a href="${pageContext.request.contextPath}/board/list">게시판 리스트</a><br>
	<a href="${pageContext.request.contextPath}/logout">로그아웃</a>
</body>
</html>