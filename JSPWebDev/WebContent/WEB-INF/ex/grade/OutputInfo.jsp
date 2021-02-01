<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="stdsco" class="edu.bit.ex.bean.StudentScore"></jsp:useBean>

<jsp:setProperty name="stdsco" property="classNum" value="${param.classNum}"/>
<jsp:setProperty name="stdsco" property="javaScore" value="${param.javaScore}"/>
<jsp:setProperty name="stdsco" property="dbScore" value="${param.dbScore}"/>
<jsp:setProperty name="stdsco" property="jspScore" value="${param.jspScore}"/>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>당신의 성적은...</title>
	<style type="text/css">
		.content {
			font-weight: bold;
		}
		
		#avg {
			font-weight: bold;
			border-color: red;
			color: red;
		}
	</style>
</head>
<body>
	<table border="1">
			<tr>
				<td colspan="2">학번
				<td class="content">${stdsco.classNum}
			</tr>
			<tr>
				<td rowspan="4">과목
			</tr>
			<tr>
				<td>Java
				<td class="content">${stdsco.javaScore}
			</tr>
			<tr>
				<td>Database
				<td class="content">${stdsco.dbScore}
			</tr>
			<tr>
				<td>JSP
				<td class="content">${stdsco.jspScore}
			</tr>
			<tr>
				<td colspan="2">평균점수
				<td id="avg">${stdsco.getAvg(stdsco.javaScore, stdsco.dbScore, stdsco.jspScore)}
			</tr>
			<tr>
				<td colspan="3" width="100px">
					<button type="button" onclick="location.href='InputInfo.jsp'">입력화면</button>
			</tr>
		</table>
</body>
</html>