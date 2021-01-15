<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>컨텐츠 페이지</title>
</head>
<body>
	<table border="1" width="500px">
		<form action="modify.do" method="post">
			<input type="hidden" name="bId" value="${contentView.bId}">
			<tr>
				<td>번호</td>
				<td>${contentView.bId}</td>
			</tr>
			<tr>
				<td>히트</td>
				<td>${contentView.bHit}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="bName" value="${contentView.bName}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="bTitle" value="${contentView.bTitle}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea cols="20" rows="10" name="bContent">${contentView.bContent}</textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정">&nbsp;&nbsp;
					<a href="list.do">목록보기</a>&nbsp;&nbsp;
					<a href="delete.do?bId=${contentView.bId}">삭제</a>&nbsp;&nbsp;
					<a href="reply_view.do?bId=${contentView.bId}">답변</a>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>