<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- JSTL 선언(core) -->   
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
	varName : <c:out value="${varName}"></c:out><hr><br>
	
	<!-- 변수 값 지우기 -->
	<c:remove var="varName"/>
	varName : <c:out value="${varName}">지워짐!</c:out><hr><br>
	
	<!-- 예외 처리 
	에러 메시지:
	<c:catch var="error">
		${2/0}
	</c:catch><br>
	<c:out value="${error}"></c:out><hr><br>
	-->
	<!-- 조건문 if -->
	if문 :
	<c:if test="${1+2 == 3}">
		1 + 2 = 3
	</c:if>
	<c:if test="${1+2 != 3}">
		1 + 2 != 3
	</c:if><hr><br>
	
	
	for문 :
	<c:forEach var="fEach" begin="0" end="30" step="3">
		${fEach}
	</c:forEach><br>
	<%
		// 배열을 이용하여 출력하기
		String[] arr = {"순두부", "된장찌개", "제육덮밥"};
		request.setAttribute("menu", arr);
	%>
	<ul>
		<c:forEach var="dish" items="${menu}">
		<li>${dish}</li>
		</c:forEach>
	</ul>
	<%
		// 리스트를 이용하여 출력하기
		ArrayList list = new ArrayList();
		list.add("김치찌개");
		list.add("삼겹살");
		list.add("청국장");
		request.setAttribute("menu1", list);
	%>
	<ul>
		<c:forEach var="dish" items="${menu1}">
		<li>${dish}</li>
		</c:forEach>
	</ul>
		
</body>
</html>