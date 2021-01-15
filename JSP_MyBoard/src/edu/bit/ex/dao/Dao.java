package edu.bit.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.bit.ex.dto.Dto;

public class Dao {
	private DataSource dataSource;
	
	public Dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Dto> list() {
		ArrayList<Dto> dtos = new ArrayList<Dto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent "
						 + "FROM mvc_board "
						 + "ORDER BY bGroup DESC, bStep ASC";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int bId = resultSet.getInt("bId");
				String bName = resultSet.getString("bName");
				String bTitle = resultSet.getString("bTitle");
				String bContent = resultSet.getString("bContent");
				Timestamp bDate = resultSet.getTimestamp("bDate");
				int bHit = resultSet.getInt("bHit");
				int bGroup = resultSet.getInt("bGroup");
				int bStep = resultSet.getInt("bStep");
				int bIndent = resultSet.getInt("bIndent");

				Dto dto = new Dto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
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

	public Dto contentView(String bId) {
		Dto dtos = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "SELECT * "
						 + "FROM mvc_board "
						 + "WHERE bId = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(bId));
			
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
	            int id = resultSet.getInt("bId");
	            String bName = resultSet.getString("bName");
	            String bTitle = resultSet.getString("bTitle");
	            String bContent = resultSet.getString("bContent");
	            Timestamp bDate = resultSet.getTimestamp("bDate");
	            int bHit = resultSet.getInt("bHit");
	            int bGroup = resultSet.getInt("bGroup");
	            int bStep = resultSet.getInt("bStep");
	            int bIndent = resultSet.getInt("bIndent");
	            
	            dtos = new Dto(id, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
	         }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}

	public void dodify(String bId, String bName, String bTitle, String bContent) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();

			String query = "UPDATE mvc_board "
						 + "SET bName = ?, bTitle = ?, bContent = ? "
						 + "WHERE bId = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bName);
			preparedStatement.setString(2, bTitle);
			preparedStatement.setString(3, bContent);
			preparedStatement.setInt(4, Integer.parseInt(bId));
			
			int rn = preparedStatement.executeUpdate();
			System.out.println("modify 반환 결과: " + rn);
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

	public Dto replyView(String bId) {
		Dto dtos = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "SELECT * "
						 + "FROM mvc_board "
						 + "WHERE bId = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(bId));		
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
	            int id = resultSet.getInt("bId");
	            String bName = resultSet.getString("bName");
	            String bTitle = resultSet.getString("bTitle");
	            String bContent = resultSet.getString("bContent");
	            Timestamp bDate = resultSet.getTimestamp("bDate");
	            int bHit = resultSet.getInt("bHit");
	            int bGroup = resultSet.getInt("bGroup");
	            int bStep = resultSet.getInt("bStep");
	            int bIndent = resultSet.getInt("bIndent");
	            
	            dtos = new Dto(id, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
	         }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public void reply(String bId, String bName, String bTitle,
		String bContent, String bGroup, String bStep, String bIndent) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			String query = "INSERT INTO mvc_board (bId, bName, bTitle,"
								+ " bContent, bGroup, bStep, bIndent) "
					     + "VALUES (mvc_board_seq.nextval, ?, ?,"
					     		+ " ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, bName);
            preparedStatement.setString(2, bTitle);
            preparedStatement.setString(3, bContent);
            preparedStatement.setInt(4, Integer.parseInt(bGroup));
            preparedStatement.setInt(5, Integer.parseInt(bStep) + 1);
            preparedStatement.setInt(6, Integer.parseInt(bIndent) + 1);
		
            int rn = preparedStatement.executeUpdate();
            System.out.println("reply 반환 결과: " + rn);
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

	public void delete(String bId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();

			String query = "DELETE FROM mvc_board "
						 + "WHERE bId = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(bId));
			
			int rn = preparedStatement.executeUpdate();
			System.out.println("delete 반환 결과: " + rn);
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