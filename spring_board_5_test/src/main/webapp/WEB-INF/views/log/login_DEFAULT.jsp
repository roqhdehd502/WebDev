<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
    
	<title>Login Page</title>
	
	<link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/sign-in/">
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <!-- Custom styles for this template -->
    
    <link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet">
</head>
<body>
	<c:if test="${user == null}">
		<form class="form-signin" role="form" method="post" autocomplete="off" action="${pageContext.request.contextPath}/login">
		   <a href="https://github.com/roqhdehd502">
		   	  <center>
		   	  	  <img class="mb-4" src="https://avatars.githubusercontent.com/u/47406388?s=460&u=be5c94a9effdfe887c56be3dec5ca29e224e83ce&v=4" alt="" width="72" height="72">
		   	  </center>
		   </a>
		   
		   <h1 class="h3 mb-3 font-weight-normal"><center>아이디와 비밀번호를<br>입력해주세요.</center></h1>
		   <!--<p>
		   	   <label for="userId">아이디</label>
		   	  <input type="text" id="userId" name="id" /> 	  
		   </p>-->  
		   <label for="inputEmail" class="sr-only">아이디</label>
		   <input type="text" id="inputId" class="form-control" placeholder="아이디" name="id" required autofocus>
		   
		   <!--<p>
		      <label for="userPass">패스워드</label> 
		      <input type="password" id="userPass" name="pw"/>
		   </p>--> 
		   <label for="inputPassword" class="sr-only">패스워드</label>
      	   <input type="password" id="inputPassword" class="form-control" placeholder="패스워드" name="pw" required>
		   
		   <div class="checkbox mb-3">
	          <label>
	             <input type="checkbox" value="remember-me"> 입력사항 기억
	          </label>
      	   </div>
      	   
      	   <!--<p><button type="submit">로그인</button></p>
		   <p><a href="/member/register">회원가입</a></p> -->
      	   <button class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>	   
		   <p class="mt-5 mb-3 text-muted"><center>2021&copy;All rights reserved by <a href="https://getbootstrap.com/">getbootstrap</a>.<br><br>
		   Designed and built with all the love in the world by the Bootstrap team with the help of our contributors.<br>
		   Currently v5.0.0-beta1. Code licensed MIT, docs CC BY 3.0.<br>
		   </center></p>
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
</body>
</html>