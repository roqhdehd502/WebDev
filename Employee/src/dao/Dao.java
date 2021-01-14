package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dto.Dto;

public class Dao {
	private DataSource dataSource;
	
	public Dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 전체 직원 정보 리스트
	public ArrayList<Dto> list() {
		ArrayList<Dto> dtos = new ArrayList<Dto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, d.deptno, d.dname, d.loc "
						 + "FROM dept01 d, emp01 e "
						 + "WHERE d.deptno = e.deptno AND "
							 	+ "e.mgr IN (SELECT employee.mgr "
									   + "FROM emp01 employee, emp01 manager "
									   + "WHERE employee.mgr = manager.empno)";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				int empno = resultSet.getInt("empno");
				String ename = resultSet.getString("ename");
				String job = resultSet.getString("job");
				int mgr = resultSet.getInt("mgr");
				Timestamp hiredate = resultSet.getTimestamp("hiredate");
				int sal = resultSet.getInt("sal");
				int comm = resultSet.getInt("comm");
				int deptno = resultSet.getInt("deptno");
				String dname = resultSet.getString("dname");
				String loc = resultSet.getString("loc");
				
				Dto dto = new Dto(empno, ename, job, mgr, hiredate,
						sal, comm, deptno, dname, loc);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) { connection.close(); }
				if (preparedStatement != null) { preparedStatement.close(); }	
				if (resultSet != null) { resultSet.close(); }
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	// 매니저(상사) 리스트 출력
	public ArrayList<Dto> mgrList() {
		ArrayList<Dto> dtos = new ArrayList<Dto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT manager.empno, manager.ename "
						 + "FROM emp01 employee, emp01 manager "
						 + "WHERE employee.mgr = manager.empno "
						 + "GROUP BY manager.ename, manager.empno";

			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				int empno = resultSet.getInt("empno");
				String ename = resultSet.getString("ename");
				
				Dto dto = new Dto(empno, ename);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) { connection.close(); }
				if (preparedStatement != null) { preparedStatement.close(); }	
				if (resultSet != null) { resultSet.close(); }
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	// 부서 리스트 출력
	public ArrayList<Dto> deptList() {
		ArrayList<Dto> dtos = new ArrayList<Dto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT deptno, dname "
						 + "FROM dept01";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				int deptno = resultSet.getInt("deptno");
				String dname = resultSet.getString("dname");
				
				Dto dto = new Dto(deptno, dname);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) { connection.close(); }
				if (preparedStatement != null) { preparedStatement.close(); }	
				if (resultSet != null) { resultSet.close(); }
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}

	// 근무지 리스트 출력
	public ArrayList<Dto> locList() {
		ArrayList<Dto> dtos = new ArrayList<Dto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT loc "
						 + "FROM dept01";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String loc = resultSet.getString("loc");
				
				Dto dto = new Dto(loc);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) { connection.close(); }
				if (preparedStatement != null) { preparedStatement.close(); }	
				if (resultSet != null) { resultSet.close(); }
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
}