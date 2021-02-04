<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Emp - List</title>
</head>
<body>
	<table border="1">
		<tr>
			<td colspan="10"><a href="write_view.do">직원정보추가</a></td>
		</tr>
		<tr>
			<td>직원번호</td>
			<td>직원이름</td>
			<td>업무</td>
			<td>매니저</td>
			<td>입사일</td>
			<td>급여</td>
			<td>커미션</td>
			<td>부서번호</td>
			<td>부서명</td>
			<td>부서위치</td>
		</tr>
		
		<c:forEach items="${list}" var="dto">
        <tr>
			<td>${dto.empno}</td>
			<td>${dto.ename}</td>
			<td>${dto.job}</td>
			<td>${dto.mgr}</td>     
			<td>${dto.hiredate}</td>		        
			<td>${dto.sal}</td>
			<td>${dto.comm}</td>
			<td>${dto.deptno}</td>
			<td>${dto.dname}</td>
			<td>${dto.loc}</td>	        
	    </tr>         
        </c:forEach>

		<tr>
			<td>직원번호</td>
			<td>직원이름</td>
			<td>업무</td>
			<td>매니저</td>
			<td>입사일</td>
			<td>급여</td>
			<td>커미션</td>
			<td>부서번호</td>
			<td>부서명</td>
			<td>부서위치</td>
		</tr>
	</table>
</body>
</html>