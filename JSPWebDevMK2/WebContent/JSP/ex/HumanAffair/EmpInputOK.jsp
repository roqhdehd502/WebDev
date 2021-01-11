<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.Timestamp" %>
<%@ page import="ex.humanAffair.*" %>

<% request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id="dto" class="ex.humanAffair.EmpDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>

<%
	dto.setrDate(request.getParameter("rDate"));
	EmpDAO dao = EmpDAO.getInstance();
	if((dao.(EmpDTO dto)) != 1) { // 부서 테이블 입력 실패
%>
	<script type="text/javascript">
		alert("부서 테이블의 입력 데이터가 올바르지 않습니다!");
		history.back();
	</script>
<%
	} else if((dao.insertEmp(EmpDTO dto)) != 2) { // 직원 테이블 입력 실패
%>
		<script type="text/javascript">
		alert("직원 테이블의 입력 데이터가 올바르지 않습니다!");
		history.back();
		</script>
<%
	}
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Access</title>
</head>
<body>
	<h1>정보입력이 정상적으로 처리 되었습니다.</h1>
	<jsp:forward page="EmpOutput.jsp">리스트</jsp:forward>
</body>
</html>