<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>과연 결과는?</title>
</head>
<body>
	<%
		Random random = new Random();
	
		String rsp = request.getParameter("rsp");
		int com = random.nextInt(3) + 1;
	%>
	
	
	<%
		out.println("<h1>당신이 낸 것</h1>");
		if(rsp.equals("가위")) {
	%>
			<img src="http://isweb.joongbu.ac.kr/~jgm/photo/sissor.jpeg">
	<%
		} else if(rsp.equals("바위")) {
	%>
			<img src="http://isweb.joongbu.ac.kr/~jgm/photo/rock.jpeg">
	<%
		} else if(rsp.equals("보")) {
	%>
			<img src="http://isweb.joongbu.ac.kr/~jgm/photo/paper.png">	
	<%
		}
	%>
	
	<%
		out.println("<h1>컴퓨터가 낸 것</h1>");
		if(com == 1) {
	%>
			<img src="http://isweb.joongbu.ac.kr/~jgm/photo/sissor.jpeg">
	<%
		} else if(com == 2) {
	%>
			<img src="http://isweb.joongbu.ac.kr/~jgm/photo/rock.jpeg">
	<%
		} else if(com == 3) {
	%>
			<img src="http://isweb.joongbu.ac.kr/~jgm/photo/paper.png">	
	<%
		}
	%>
		
	<%
		switch(com) {
		case 1 : // 가위
			if(rsp.equals("가위")) {
				out.println("<h1>비김</h1>");
			} else if(rsp.equals("바위")) {
				out.println("<h1>승리</h1>");
			} else if(rsp.equals("보")) {
				out.println("<h1>패배</h1>");
			}
			break;
		case 2 : // 바위
			if(rsp.equals("가위")) {
				out.println("<h1>패배</h1>");
			} else if(rsp.equals("바위")) {
				out.println("<h1>비김</h1>");
			} else if(rsp.equals("보")) {
				out.println("<h1>승리</h1>");
			}
			break;
		case 3 : // 보
			if(rsp.equals("가위")) {
				out.println("<h1>승리</h1>");
			} else if(rsp.equals("바위")) {
				out.println("<h1>패배</h1>");
			} else if(rsp.equals("보")) {
				out.println("<h1>비김</h1>");
			}
			break;
		}
	%>

	<a href="RSP.jsp">다시 하기</a>
</body>
</html>