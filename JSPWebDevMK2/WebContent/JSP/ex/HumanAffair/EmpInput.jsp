<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>사원 정보 입력</title>
</head>
<body>
	<h1>사원 정보 입력</h1>
	<hr>
	<form action="EmpInputOK.jsp" method="post">
		사원번호<input type="text" name="empno"><br>
		사원이름<input type="text" name="ename"><br>
		직급<input type="text" name="job"><br>
		상사<select>
			<option>(7839)JONES
			<option>(7839)BLAKE
			<option>(7839)CLARK
			<option>(0)KING
		</select><br>
		입사일<input type="date" name="hiredate"><br>
		급여<input type="text" name="sal"><br>
		커미션<input type="text" name="comm"><br>
		부서 <select>
			<option>(10)ACCOUNTING
			<option>(20)RESEARTH
			<option>(30)SALES
			<option>(40)OPERATIONS
		</select><br>
		부서위치 <select>
			<option>BOSTON
			<option>CHICAGO
			<option>DALLAS
			<option>NEW WORK
		</select><br>
		<input type="submit" value="입력">
	</form>
</body>
</html>