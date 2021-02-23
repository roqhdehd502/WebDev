<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="<c:url value="/resources/images/icons/favicon.ico"/>"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css"/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/fonts/iconic/css/material-design-iconic-font.min.css"/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/animate/animate.css"/>">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/css-hamburgers/hamburgers.min.css"/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/animsition/css/animsition.min.css"/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/select2/select2.min.css"/>">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/daterangepicker/daterangepicker.css"/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/util.css"/>">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css"/>">
<!--===============================================================================================-->
	<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
</head>
<body>
	<c:if test="${user == null}">
		<form class="form-signin" role="form" method="post" autocomplete="off" action="${pageContext.request.contextPath}/login">
			<div class="limiter">
				<div class="container-login100" style="background-image: url('<c:url value="/resources/images/bg-01.jpg"/>');">
					<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
						<form class="login100-form validate-form">
							<span class="login100-form-title p-b-49">
								Login
							</span>
		
							<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is reauired">
								<span class="label-input100">Username</span>
								<input class="input100" type="text" name="id" placeholder="아이디">
								<span class="focus-input100" data-symbol="&#xf206;"></span>
							</div>
		
							<div class="wrap-input100 validate-input" data-validate="Password is required">
								<span class="label-input100">Password</span>
								<input class="input100" type="password" name="pw" placeholder="패스워드">
								<span class="focus-input100" data-symbol="&#xf190;"></span>
							</div>
							
							<div class="text-right p-t-8 p-b-31">
								<a href="#">
									Forgot password?
								</a>
							</div>
							
							<div class="container-login100-form-btn">
								<div class="wrap-login100-form-btn">
									<div class="login100-form-bgbtn"></div>
									<button class="login100-form-btn" type="submit">
										Login
									</button>
								</div>
							</div>
		
							<div class="txt1 text-center p-t-54 p-b-20">
								<span>
									Or Sign In Using
								</span>
							</div>
							
							
							
							<!-- ====================================== -->
							<div class="flex-c-m">
								<!-- <a href="#" class="login100-social-item bg1"> -->
								<a href="${kakaoUrl}" 
								   class="login100-social-item bg1">
									<img src="<c:url value="/resources/img/kakao_circle.png"/>" width="52" height="52">
									<!-- <i class="fa fa-facebook"></i> -->
								</a>
		
								<a href="${naverUrl}" class="login100-social-item bg2">
									<img src="<c:url value="/resources/img/naver-icon-file.jpg"/>" width="52" height="52">
									<!-- <i class="fa fa-twitter"></i> -->
								</a>
		
								<a href="#" class="login100-social-item bg3">
									<i class="fa fa-google"></i>
								</a>
							</div>
				            <!-- ====================================== -->
				            
				            
				            
							<div class="flex-col-c p-t-155">
								<span class="txt1 p-b-17">
									Or Sign Up Using
								</span>
		
								<a href="#" class="txt2">
									Sign Up
								</a>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div id="dropDownSelect1"></div>
		</form>
	</c:if>
	
	<c:if test="${msg == false}">
	   <p style="color:#f00;">로그인에 실패했습니다. 아이디 또는 패스워드를 다시 입력해주십시오.</p>
	</c:if>
	
	<c:if test="${user != null}">
	   <p>${user.username}님 환영합니다.</p>
	   
	   <!-- <a href="member/modify">회원정보 수정</a>, <a href="member/withdrawal">회원탈퇴</a><br/> -->
	   <a href="${pageContext.request.contextPath}/board/list">게시판 리스트</a><br>
	   <a href="${pageContext.request.contextPath}/logout">로그아웃</a>   
	</c:if>
	
<!--===============================================================================================-->
	<script src="<c:url value="/resources/vendor/jquery/jquery-3.2.1.min.js"/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value="/resources/vendor/animsition/js/animsition.min.js"/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value="/resources/vendor/bootstrap/js/popper.js"/>"></script>
	<script src="<c:url value="/resources/vendor/bootstrap/js/bootstrap.min.js"/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value="/resources/vendor/select2/select2.min.js"/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value="/resources/vendor/daterangepicker/moment.min.js"/>"></script>
	<script src="<c:url value="/resources/vendor/daterangepicker/daterangepicker.js"/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value="/resources/vendor/countdowntime/countdowntime.js"/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value="/resources/js/main.js"/>"></script>

</body>
</html>