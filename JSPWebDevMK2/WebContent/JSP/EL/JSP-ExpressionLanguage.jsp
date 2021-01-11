<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="member" class="edu.bit.ex.MemberInfo" scope="page"></jsp:useBean>

<jsp:setProperty name="member" property="name" value="홍길동"/>
<jsp:setProperty name="member" property="id" value="abc"/>
<jsp:setProperty name="member" property="pw" value="123"/>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>표현식</h1>
	정수: ${10}<br>
	소수: ${99.99}<br>
	문자열: ${"ABC"}<br>
	Boolean ${true}<br>
	<hr>
	
	<h1>산술연산</h1>
	1 + 2 = ${1+2}<br>
	1 - 2 = ${1-2}<br>
	<hr>
	
	<h1>비교 및 조건연산</h1>
	1 > 2: ${1>2}<br>
	1 < 2: ${1<2}<br>
	1이 2보다 크다면? 1 아니면 2: ${(1>2) ? 1 : 2}<br>
	1이 2보다 크거나 1이 2보다 작거나: ${(1>2) || (1<2)}<br>
	<hr>
	
	<h1>액션태그 표현</h1>
	<h2>자바 빈</h2>
	이름: <jsp:getProperty property="name" name="member"/><br>
	ID: <jsp:getProperty property="id" name="member"/><br>
	PW: <jsp:getProperty property="pw" name="member"/><br>
	<h2>EL</h2>
	이름: ${member.name}<br>
	ID: ${member.id}<br>
	PW: ${member.pw}<br>
</body>
</html>