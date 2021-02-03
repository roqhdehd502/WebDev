<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="rspAl" class="edu.bit.ex.bean.Rsp"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>과연 결과는?</title>
</head>
<body>
	<% String user = request.getParameter("user"); %>
	
	<%
		out.println("<h1>당신이 낸 것</h1>");
		if(user.equals("가위")) {
	%>
			<img src="http://isweb.joongbu.ac.kr/~jgm/photo/sissor.jpeg">
	<%
		} else if(user.equals("바위")) {
	%>
			<img src="http://isweb.joongbu.ac.kr/~jgm/photo/rock.jpeg">
	<%
		} else if(user.equals("보")) {
	%>
			<img src="http://isweb.joongbu.ac.kr/~jgm/photo/paper.png">	
	<%
		}
	%>
	
	<%
		out.println("<h1>컴퓨터가 낸 것</h1>");
		if(rspAl.getCom() == 1) {
	%>
			<img src="http://isweb.joongbu.ac.kr/~jgm/photo/sissor.jpeg">
	<%
		} else if(rspAl.getCom() == 2) {
	%>
			<img src="http://isweb.joongbu.ac.kr/~jgm/photo/rock.jpeg">
	<%
		} else if(rspAl.getCom() == 3) {
	%>
			<img src="http://isweb.joongbu.ac.kr/~jgm/photo/paper.png">	
	<%
		}
	%>
	
	<h1><% out.println(rspAl.compareResult(user)); %></h1>
	<a href="RSPMk2.html">다시 하기</a>
</body>
</html>