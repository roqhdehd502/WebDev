<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>글 작성 페이지</title>
</head>
<body>
	<table border="1" width="500px">
		<form action="write.do" method="post">
			<tr>
				<td>이름</td>
				<td><input type="text" name="bName"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="bTitle"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea cols="20" rows="10" placeholder="Write Your Comments."></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="게시">&nbsp;&nbsp;
					<a href="list.do">목록</a>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>