<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	String driver = "oracle.jdbc.driver.OracleDriver"; // 드라이버 위치
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 해당 주소
	String uid = "scott"; // 테이블 명
	String upw = "tiger"; // 테이블 pw
	String query = "select * from emp"; // 테이블 내 쿼리
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JDBC - JSP Connection</title>
</head>
<body>
	<%
		try{
			Class.forName(driver); // driver 가져오기
			connection = DriverManager.getConnection(url, uid, upw);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			
			out.println("이름: ");
			while(resultSet.next()) {
				String name = resultSet.getString("ename");	
				out.println(name + " ");
			}
			out.println("<br>");
		} catch(Exception e) {
			
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e) {
				
			}
		}
	%>
</body>
</html>