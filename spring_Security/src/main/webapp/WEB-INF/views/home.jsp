<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Home Page</title>
</head>

<body>
	<h1>메인페이지</h1>
	
	<sec:authorize access="isAnonymous()">
	   <p><a href="<c:url value="/login/loginForm" />">로그인</a></p>
	</sec:authorize>
	
	<sec:authorize access="isAuthenticated()">
	   <form:form action="${pageContext.request.contextPath}/logout" method="POST">
	       <button type="button" onclick="location.href='${pageContext.request.contextPath}/restful/board'">게시판</button>	
	       <input type="submit" value="로그아웃" />
	   </form:form>
	</sec:authorize>
	
	<h3>
	    [<a href="<c:url value="/user/userForm" />">회원가입</a>]
	    [<a href="<c:url value="/user/userHome" />">유저 홈</a>]
	    [<a href="<c:url value="/admin/adminHome" />">관리자 홈</a>]
	</h3>
</body>
</html>