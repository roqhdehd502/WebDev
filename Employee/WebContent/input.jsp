<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("UTF-8"); %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>사원 정보 입력</title>
</head>
<body>
	<h1>사원 정보 입력</h1>
	<hr>
	<form action="inputCheck.do" method="post">
		사원번호<input type="text" name="empno"><br>
		사원이름<input type="text" name="ename"><br>
		직급<input type="text" name="job"><br>
		상사<select>
			<c:forEach var="mgr" items="${mgrList}">
				<option value="${mgr.mgr}">(${mgr.empno})${mgr.ename}</option>
			</c:forEach>
		</select><br>
		입사일<input type="date" name="hiredate"><br>
		급여<input type="text" name="sal"><br>
		커미션<input type="text" name="comm"><br>
		부서 <select>
			<c:forEach var="dept" items="${deptList}">
				<option value="${dept.deptno}">(${dept.deptno})${dept.dname}</option>
			</c:forEach>
		</select><br>
		부서위치 <select>
			<c:forEach var="loc" items="${locList}">
				<option value="${loc.loc}">${loc.loc}</option>
			</c:forEach>
		</select><br>
		<input type="submit" value="입력하기">&nbsp;&nbsp;
		<input type="button" value="입력하지 않고 리스트보기" onclick="location.href='list.do'">
	</form>
</body>
</html>