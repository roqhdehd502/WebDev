<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>EMP - Write</title>
	
	<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
	
	<script type="text/javascript">
		$(document).ready(function() {
			$("#sbmBtn").click(function() {
				if($("#empno").val() == "") { // 입력정보만 검사
					alert("사원번호를 입력하세요.");
					event.preventDefault();
				} else if ($("#ename").val() == "") {
					alert("사원이름을 입력하세요.");
					event.preventDefault();
				} else if ($("#hiredate").val() == "") {
					alert("입사일을 입력하세요.");
					event.preventDefault();
				} else if ($("#sal").val() == "") {
					alert("급여를 입력하세요.");
					event.preventDefault();
				} else {
					alert("입력이 완료 되었습니다.");
					$("#loginForm").submit();
				}				
			});
			
			$("#resBtn").click(function() {
				alert("입력 정보가 초기화 되었습니다.");
				$("#loginForm")[0].reset();
			});
		});
	</script>
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