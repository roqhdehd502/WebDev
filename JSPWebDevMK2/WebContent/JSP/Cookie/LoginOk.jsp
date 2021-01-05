<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login Access Page</title>
</head>
<body>
	<h2>로그인 성공 페이지</h2>
	<%
		/* 로그인 인증 확인 */
		String id = null; // 로그인한 id의 객체를 비교하기 위해 null로 초기화
		Cookie[] cookies = request.getCookies(); // 쿠키 배열을 생성하여 LoginCheck.jsp에 생성한 쿠키 요청
		
		for(Cookie c : cookies) { // 요청한 쿠키 순차탐색
			if(c.getName().equals("id")) { // 요청했던 쿠키에 id가 있으면
				id = c.getValue(); // 쿠키 배열에 담기
			}
		}
		
		if(id == null) { // id가 null이면(입력값이 유효하지 않으면)
			response.sendRedirect("login.html"); // 로그인 페이지로 리다이렉트하기
		}
	%>
	
	<!-- 로그인 인증이 완료되면 해당 계정정보 출력 -->
	<%= id %> 님 반갑습니다.
	<a href = "logout.jsp">로그아웃</a>
</body>
</html>