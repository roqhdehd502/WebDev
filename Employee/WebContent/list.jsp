<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("UTF-8"); %>    
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>직원 목록</title>
	<style type="text/css">
		tr:last-child {
			background-color: yellow;
		}
	</style>
</head>
<body>
   <h1>EMP 테이블 직원 목록</h1>
   <table cellpadding="0" cellspacing="0" border="1">
      <tr>
         <td>사원번호
         <td>사원이름
         <td>직급(업무)
         <td>상사(이름)
         <td>입사일
         <td>급여
         <td>커미션
         <td>부서번호
         <td>부서이름
         <td>부서위치
         <td>관리
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
	         <td><a href="">관리</a></td>
	      </tr>
	  </c:forEach>
   </table>
</body>
</html>
</html>