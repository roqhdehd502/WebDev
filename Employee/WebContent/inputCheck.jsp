<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% request.setCharacterEncoding("UTF-8"); %>

<c:choose>
	<c:when test="${dao.list() == null} ">
		<script type="text/javascript">
			alert("입력 데이터가 올바르지 않습니다!");
			history.back();
		</script>
	</c:when>
</c:choose>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>정보입력이 정상적으로 처리 되었습니다.</h1>
	<a href="list.do">리스트</a>
</body>
</html>