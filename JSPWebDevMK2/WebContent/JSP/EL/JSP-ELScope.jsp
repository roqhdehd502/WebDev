<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<!--  
	<form action="result2.jsp">
		<input type="submit" value="결과">
	</form>
	-->
	
	<%
      application.setAttribute("application_name", "application_value");
      session.setAttribute("session_name", "session_value");
      request.setAttribute("request_name", "request_value");
      pageContext.setAttribute("page_name", "pageContext_value");
    %>
   
	${applicationScope.application_name}<br>
	${sessionScope.session_name}<br>
	${requestScope.request_name}<br>
	${pageScope.page_name}<br>
	
	<jsp:forward page="result2.jsp"></jsp:forward>
</body>
</html>