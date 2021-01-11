<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- JSTL 선언 -->   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<!-- 변수 선언 및 초기화 -->
	<c:set var="varName" value="varValue"></c:set>
	varName : <c:out value="${varName}"></c:out><br>
	
	<!-- 변수 값 지우기 -->
	<c:remove var="varName"/>
	varName : <c:out value="${varName}"></c:out><br>
	
	<!-- 예외 처리 -->
	에러 메시지:
	<c:catch var="error">
		${2/0}
	</c:catch><br>
	<c:out value="${error}"></c:out>
</body>
</html>