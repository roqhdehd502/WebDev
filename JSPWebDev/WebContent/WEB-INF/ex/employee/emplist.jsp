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
	<title>사원 정보</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>EMPNO</td>
			<td>ENAME</td>
			<td>JOB</td>
			<td>MGR</td>
			<td>HIREDATE</td>
			<td>SAL</td>
			<td>COMM</td>
			<td>DEPTNO</td>
		</tr>
		
		<%try {
				Class.forName(driver); // driver 가져오기
				connection = DriverManager.getConnection(url, uid, upw);
				statement = connection.createStatement();
				resultSet = statement.executeQuery(query);
				
				while(resultSet.next()) {
					String empno = resultSet.getString("empno");
					String ename = resultSet.getString("ename");
					String job = resultSet.getString("job");
					String mgr = resultSet.getString("mgr");
					String hiredate = resultSet.getString("hiredate");
					String sal = resultSet.getString("sal");
					String comm = resultSet.getString("comm");
					String deptno = resultSet.getString("deptno");
					
					out.println("<tr>");
					out.println("<td>" + empno + "</td>");
					out.println("<td>" + ename + "</td>");
					out.println("<td>" + job + "</td>");
					
					if(mgr == null) {
						out.println("<td>\t</td>");
					} else {
						out.println("<td>" + mgr + "</td>");
					}
			
					out.println("<td>" + hiredate + "</td>");
					out.println("<td>" + sal + "</td>");
					
					if(comm == null) {
						out.println("<td>\t</td>");
					} else {
						out.println("<td>" + comm + "</td>");
					}
					
					out.println("<td>" + deptno + "</td>");
					out.println("</tr>");
				}
			} catch(Exception e) {
				
			} finally {
				try {
					if(resultSet != null) resultSet.close();
					if(statement != null) statement.close();
					if(connection != null) connection.close();
				} catch (Exception e) {
					
				}
			}%>
	</table>
</body>
</html>