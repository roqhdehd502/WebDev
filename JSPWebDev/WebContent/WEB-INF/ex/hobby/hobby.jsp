<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>당신의 정보를 입력해주세요.</title>
</head>
<body>
	<form action="../../HS" method="post">
		이름 : <input type="text" name="uname"><br>
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="pw"><br>
		취미 : <input type="checkbox" name="hb" value="Book" checked="checked">독서 
			<input type="checkbox" name="hb" value="Cook">요리 
			<input type="checkbox" name="hb" value="Jog">조깅
			<input type="checkbox" name="hb" value="Swim">수영
			<input type="checkbox" name="hb" value="Sleep">취침<br>
		전공 : <input type="radio" name="subject" value="Kor">국어
			<input type="radio" name="subject" value="Eng">영어
			<input type="radio" name="subject" value="Math">수학
			<input type="radio" name="subject" value="Design">디자인<br>
		<select name="protocol">
			<option>ftp
			<option>utp
			<option>http
			<option>tcp
		</select><br>
		<input type="submit" value="전송">
		<input type="reset" value="초기화">
	</form>
</body>
</html>