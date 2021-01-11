<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.Timestamp" %>
    
<%
	int empno = (int)session.getAttribute("name"); // 사원번호(EMP)
	String ename = (String)session.getAttribute("ename"); // 사원이름(EMP)
	String job = (String)session.getAttribute("job"); // 사원직급(EMP)
	int mgr = (int)session.getAttribute("mgr"); // 상사(EMP)
	Timestamp rDate = (Timestamp)session.getAttribute("rDate"); // 입사일(EMP)
	int sal = (int)session.getAttribute("sal"); // 급여(EMP)
	int comm = (int)session.getAttribute("comm"); // 커미션(EMP)
	int deptno = (int)session.getAttribute("deptno"); // 부서번호(EMP, DEPT)
	String dname = (String)session.getAttribute("dname"); // 부서이름(DEPT)
	String loc = (String)session.getAttribute("loc");
%>

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
		
		<%
		while() {
			out.println("<tr>");
			out.println("<td>" + empno + "</td>");
			out.println("<td>" + ename + "</td>");
			out.println("<td>" + job + "</td>");
			out.println("<td>" + mgr + "</td>");
			out.println("<td>" + rDate + "</td>");
			out.println("<td>" + sal + "</td>");
			out.println("<td>" + comm + "</td>");
			out.println("<td>" + deptno + "</td>");
			out.println("<td>" + dname + "</td>");
			out.println("<td>" + loc + "</td>");
			out.println("<td><a href=\"#\">수정</td>");
			out.println("</tr>");
		}
		%>
	</table>
</body>
</html>