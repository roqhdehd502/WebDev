package edu.bit.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.bit.ex.dto.DTO;

public class DAO {
	private DataSource dataSource;
	
	public DAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 전직원 리스트
	public ArrayList<DTO> list() {
		ArrayList<DTO> dtos = new ArrayList<DTO>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, d.deptno, d.dname, d.loc FROM dept01 d, emp01 e WHERE d.deptno = e.deptno AND e.mgr IN (SELECT employee.mgr FROM emp01 employee, emp01 manager WHERE employee.mgr = manager.empno)";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int empno = resultSet.getInt("empno");
				String ename = resultSet.getString("ename");
				String job = resultSet.getString("job");
				int mgr = resultSet.getInt("mgr");
				String hiredate = resultSet.getString("hiredate");
				int sal = resultSet.getInt("sal");
				int comm = resultSet.getInt("comm"); 
				int deptno = resultSet.getInt("deptno");
				String dname = resultSet.getString("dname");
				String loc = resultSet.getString("loc");

				DTO dto = new DTO(empno, ename, job, mgr, hiredate, 
						sal, comm, deptno, dname, loc);
				dtos.add(dto);
			}		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(connection != null) { connection.close(); }
				if(preparedStatement != null) { preparedStatement.close(); }
				if(resultSet != null) { resultSet.close(); }
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dtos;
	}
	
	// 업무 리스트
	public ArrayList<DTO> jobList() {
		ArrayList<DTO> dtos = new ArrayList<DTO>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT DISTINCT job FROM emp01";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String job = resultSet.getString("job");

				DTO dto = new DTO(job);
				dtos.add(dto);
			}		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(connection != null) { connection.close(); }
				if(preparedStatement != null) { preparedStatement.close(); }
				if(resultSet != null) { resultSet.close(); }
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dtos;
	}
	
	// 매니저 리스트
	public ArrayList<DTO> mgrList() {
		ArrayList<DTO> dtos = new ArrayList<DTO>();

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

				DTO dto = new DTO(empno, ename);
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
	
	// 부서 리스트
	public ArrayList<DTO> deptList() {
		ArrayList<DTO> dtos = new ArrayList<DTO>();

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

				DTO dto = new DTO(deptno, dname);
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
	
	// 직원 정보 입력
	public void write(String empno, String ename, String job, String mgr, 
			String hiredate, String sal, String comm, String deptno) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();

			String query = "INSERT INTO emp01 (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(empno));
			preparedStatement.setString(2, ename);
			preparedStatement.setString(3, job);
			preparedStatement.setInt(4, Integer.parseInt(mgr));
			preparedStatement.setString(5, hiredate);
			preparedStatement.setInt(6, Integer.parseInt(sal));
			preparedStatement.setInt(7, Integer.parseInt(comm));
			preparedStatement.setInt(8, Integer.parseInt(deptno));
			
			int rn = preparedStatement.executeUpdate();
			System.out.println("write 반환 결과: " + rn);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}