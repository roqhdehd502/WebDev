<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="dto" class="ex.humanAffair.EmpDTO" scope="page"></jsp:useBean>
<jsp:useBean id="dao" class="ex.humanAffair.EmpDAO" scope="page"></jsp:useBean>

<jsp:setProperty name="" property=""/>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>직원 목록</title>
</head>
<body>
	<h1>EMP 테이블 직원 목록</h1>
	<table>
		<tr>
			<td>사원번호
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
	</table>
</body>
</html>