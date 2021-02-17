<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>   
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>All Page</title>
</head>
<body>
	<!-- all or member or admin -->
	<h1>/sample/all page</h1>
	
	<!-- 누구든지(isAnonymous) 허용(access) -->
	<sec:authorize access="isAnonymous()">
  		<a href="/customLogin">로그인</a>
	</sec:authorize>
	
	<!-- 인증되었으면(isAuthenticated) 허용(access) -->
	<sec:authorize access="isAuthenticated()">
  		<a href="/customLogout">로그아웃</a>
	</sec:authorize>
</body>
</html>