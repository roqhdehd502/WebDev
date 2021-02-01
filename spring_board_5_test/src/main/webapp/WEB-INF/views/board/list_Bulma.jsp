<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Board List Page</title>
		<link rel="shortcut icon" href="../images/favicon.png" type="image/x-icon">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
		<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
		<!-- Bulma Version 0.9.0-->
		<link rel="stylesheet" href="https://unpkg.com/bulma@0.9.0/css/bulma.min.css" />
		<link href="<c:url value="/resources/css/forum.css" />" rel="stylesheet">
	</head>
	<body>
		<nav class="navbar is-white topNav">
			<div class="container">
				<div class="navbar-brand">
					<a class="navbar-item" href="#"><!-- 메인페이지로 이동하게 설정할것 -->
						<img src="<c:url value="/resources/img/myboard_logo.png"/>" width="112" height="28">
					</a>
					<div class="navbar-burger burger" data-target="topNav">
						<span></span>
						<span></span>
						<span></span>
					</div>
				</div>
				<div id="topNav" class="navbar-menu">
					<!--  
					<div class="navbar-start">
						<a class="navbar-item" href="#">Home</a>
					</div>
					-->
					<div class="navbar-end">
						<div class="navbar-item">
							<div class="field is-grouped">
								<p class="control">
									<a class="button is-small">
										<span class="icon">
											<i class="fa fa-user-plus"></i>
										</span>
										<span>
											회원가입
										</span>
									</a>
								</p>
								<p class="control">
									<a class="button is-small is-info is-outlined" href="login_view">
										<span class="icon">
											<i class="fa fa-user"></i>
										</span>
										<span>로그인</span>
									</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</nav>
		
		<nav class="navbar is-white">
			<div class="container">
				<div class="navbar-menu">		
					<!--  	
					<div class="navbar-start">
						<a class="navbar-item is-active" href="#">Home</a>
					</div>
					-->				
					<div class="navbar-end">
						<div class="navbar-item">
							<input class="input" type="search" placeholder="Search forum...">
						</div>
					</div>
				</div>
			</div>
		</nav>
		
		<section class="container">
			<div class="columns">
				<div class="column is-3">
					<a class="button is-primary is-block is-alt is-large" href="write_view">글작성하기</a>
					<aside class="menu">
						<p class="menu-label">
							Menu
						</p>
						<ul class="menu-list">
							<li><span class="tag is-primary is-medium "><a href="#">메인</a></span></li>
						</ul>
					</aside>
				</div>
				<div class="column is-9">
					<div class="box content">
					
						<c:forEach items="${list}" var="dto">
						<article class="post">
							<h4>
								<c:forEach begin="1" end="${dto.bIndent}">[re]</c:forEach>
								<a href="content_view?bId=${dto.bId}">${dto.bTitle}</a>
							</h4>
							<div class="media">
								<div class="media-left">
									<span class="tag">${dto.bId}</span>
								</div>
								<div class="media-content">
									<div class="content">
										<p>
											<a href="#">${dto.bName}</a>&nbsp; <fmt:formatDate value="${dto.bDate}" pattern="YYYY-MM-DD"/> &nbsp;							
										</p>
									</div>
								</div>
								<div class="media-right">
									<span class="has-text-grey-light">Views: ${dto.bHit}</span>
								</div>
							</div>	
						</article>									
						</c:forEach>
	
					</div>
				</div>
			</div>
		</section>
		<footer class="footer">
			<div class="container">
				<div class="content has-text-centered">
					<div class="columns is-mobile is-centered">
						<div class="field is-grouped is-grouped-multiline">
							<div class="control">
								<div class="tags has-addons">
									<a class="tag is-link" href="https://github.com/BulmaTemplates/bulma-templates">Bulma Templates</a>
									<span class="tag is-light">Daniel Supernault</span>
								</div>
							</div>
							<div class="control">
								<div class="tags has-addons">
									<a class="tag is-link">The source code is licensed</a>
									<span class="tag is-light">MIT &nbsp;<i class="fa fa-github"></i></span>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</footer>
		<script src="<c:url value="/resources/js/bulma.js" />"></script>
	</body>
</html>