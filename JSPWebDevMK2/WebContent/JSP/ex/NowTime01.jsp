<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>현재 시각</title>
</head>
<body>
	<h1>몇시 일까요??</h1>
	<% Date time = new Date(); %>
	<%= time %>
</body>
</html>