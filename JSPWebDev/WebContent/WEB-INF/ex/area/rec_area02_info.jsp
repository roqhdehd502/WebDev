<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="sq" class="edu.bit.ex.bean.Square"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Output Page</title>
</head>
<body>
	<%
		String temp1 = request.getParameter("width");
		String temp2 = request.getParameter("height");
			
		int width = Integer.parseInt(temp1);
		int height = Integer.parseInt(temp2);
		
		out.println("입력한 값에 따라 사각형의 넓이는 ");
		out.println(sq.getArea(width, height) + " 입니다.");
	%>
</body>
</html>