<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="edu.bit.ex.dao.EmpDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.bit.ex.vo.EmpVO"%>
<%@page import="java.sql.*"%>

<jsp:useBean id="eDao" class="edu.bit.ex.dao.EmpDAO" scope="page"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>사원 정보</title>
</head>
<body>
	<%
		ArrayList<EmpVO> dtos = eDao.empSelect();
		/*
		for (int i = 0; i < dtos.size(); i++) {
			EmpVO vo = dtos.get(i);
			
			out.println("이름: "+vo.getEname()+", 번호: "+vo.getEmpno()+"<br/>");
		}
		*/
		out.println("<center>");
        out.println("<h1> 사원 정보</h1>");
        out.println("<table border=1 bodercolor=black>");
        out.println("<tr>");
        out.println("<th>이름</th>");
        out.println("<th>사원번호</th>");
        /*
        out.println("<th>직위</th>");
        out.println("<th>입사일</th>");
        out.println("<th>급여</th>");
        out.println("<th>성과금</th>");
        out.println("<th>부서번호</th>");
        */
        out.println("</tr>");
        // for
        for(EmpVO vo:dtos)
        {
            out.println("<tr>");
            out.println("<td>" +vo.getEname()+"</td>");
            out.println("<td>"+vo.getEmpno()+"</td>");
            /*
            out.println("<td>" +vo.getJob()+"</td>");
            out.println("<td>" +vo.getHiredate()+"</td>");
            out.println("<td>" +vo.getSal()+"</td>");
            out.println("<td>" +vo.getComm()+"</td>");
            out.println("<td>" +vo.getDeptno()+"</td>");
            */
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</center>");
	%>
</body>
</html>