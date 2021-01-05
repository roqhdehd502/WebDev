<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>logout page</title>
</head>
<body>
	<%
		Cookie user = new Cookie("id", ""); // 쿠키 객체를 새로 생성하여 값을 초기화
		user.setMaxAge(0); // 쿠키 만료시간을 0으로 설정
		response.addCookie(user); // 쿠키에 초기화 된 user 정보를 추가(보냄)
		response.sendRedirect("login.html"); // 로그이웃 후 로그인페이지로 리다이렉트
	%>
</body>
</html>