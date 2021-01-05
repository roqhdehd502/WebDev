<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login Check Page</title>
</head>
<body>
	<%
		// 로그인 페이지에서 입력한 데이터 가져오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 회원 가입때 DB에 저장했던 데이터 가져오기(모의)
		String did = "user1";
		String dpw = "1234";
		
		// 로그인한 id와 pw 검사
		if(did.equals(id)) { // 회원가입한 id가 맞으면
			if(dpw.equals(pw)) { // 회원가입한 pw가 맞으면
				Cookie user = new Cookie("id", id); // 쿠키객체 생성 후 파라미터에 id 담기
				response.addCookie(user); // user로 쿠키객체에 담기
				response.sendRedirect("LoginOk.jsp"); // 인증이 되었으므로 로그인 성공 페이지로
			} else {
				response.sendRedirect("login.html"); // pw가 틀리므로 로그인 페이지로 리다이렉트
			}
		} else {
			response.sendRedirect("login.html"); // id가 틀리므로 로그인 페이지로 리다이렉트
		}
	%>
</body>
</html>