<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>EMP - Write</title>
</head>
<body>
	<h1>사원 정보 입력</h1>
	<hr>
	<form id="loginForm" action="write" method="post">
		사원번호&nbsp;<input id="empno" type="number" name="empno"><br>
		
		사원이름&nbsp;<input id="ename" type="text" name="ename"><br>
		
		직급&nbsp;<select name="job">
					<c:forEach var="job" items="${jobList}">
						<option value="${job.job}">${job.job}</option>
					</c:forEach>
		    	 </select><br>
		
		상사&nbsp;<select name="mgr">
					<c:forEach var="mgr" items="${mgrList}">
						<option value="${mgr.empno}">(${mgr.empno}) ${mgr.ename}</option>
					</c:forEach>
				 </select><br>
		
		입사일&nbsp;<input id="hiredate" type="date" name="hiredate"><br>
		
		급여&nbsp;<input id="sal" type="number" name="sal" placeholder="4200"><br>
		
		커미션(선택)&nbsp;<input type="number" name="comm" placeholder="500"><br>
		
		부서&nbsp;<select name="deptno">
					<c:forEach var="dept" items="${deptList}">
						<option value="${dept.deptno}">(${dept.deptno}) ${dept.dname}</option>
					</c:forEach>
		    	 </select><br>
		
		<input id="sbmBtn" type="submit" value="입력하기">&nbsp;&nbsp;
		<input id="resBtn" type="reset" value="입력초기화">&nbsp;&nbsp;
		<input type="button" value="돌아가기" onclick="location.href='list'">
	</form>
</body>
</html>