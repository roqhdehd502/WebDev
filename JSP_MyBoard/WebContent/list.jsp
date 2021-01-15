<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>       

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>리스트 페이지</title>
</head>
<body>
	<form action="">
		<table border="1">
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>제목</td>
				<td>날짜</td>
				<td>조회수</td>
			</tr>
			<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.bId}</td>
				<td>${list.bName}</td>
				<td>
					<c:forEach begin="1" end="${list.bIndent}">└</c:forEach>
					<a href="content_view.do?bId=${list.bId}">${list.bTitle}</a>
				</td>
				<td>${list.bDate}</td>
				<td>${list.bHit}</td>
			</tr>
			</c:forEach>
			<tr>
				<td colspan="5"><a href="write_view.do">글작성</a></td>
			</tr>
		</table>
	</form>
</body>
</html>