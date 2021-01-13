package edu.bit.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.bit.ex.dto.BDto;

//DB 데이터 처리 객체
public class BDao { 
	private DataSource dataSource; // 커넥션 풀
	
	// 컨텍스트 내용을 생성자 함수에 구현
	public BDao() { 
		try {
			// 톰캣에 있는 context.xml내 커넥션풀 구현문을 참조해서 가져온다
			Context context = new InitialContext();
			// context.xml내 커넥션 풀에 있는 name("java:comp/env/jdbc/oracle")을 가져온다.
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 리스트로 게시글 DB Select하여 호출
	public ArrayList<BDto> list() { 
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// 커넥션풀에 있는 커넥션 메소드 호출
			connection = dataSource.getConnection();
			
			String query = "SELECT bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent "
					+ "FROM mvc_board "
					+ "ORDER BY bGroup DESC, bStep ASC"; // 게시글 정렬
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

				BDto dto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
				dtos.add(dto);
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
	
	// 게시글 내용을 Select
	public BDto contentView(String bId) { 
		BDto dtos = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// 커넥션풀에 있는 커넥션 메소드 호출
			connection = dataSource.getConnection();

			String query = "SELECT * "
					+ "FROM mvc_board "
					+ "WHERE bId = ?"; // 해당 게시글 번호를 조회
			preparedStatement = connection.prepareStatement(query);
			// ? Wild Card로 넘어온것을 순서대로 담는다.
			// preparedStatment에 들어간 String 타입을 int로 형 변환
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
	            
	            dtos = new BDto(id, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
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
	
	// 게시글을 작성하여 INSERT하기
	public void write(String bName, String bTitle, String bContent) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();

			String query = "insert into mvc_board (bId, bName,"
					+ " bTitle, bContent,"
					+ " bHit, bGroup,"
					+ " bStep, bIndent) "
					+ "values (mvc_board_seq.nextval, ?,"
					+ " ?, ?,"
					+ " 0, mvc_board_seq.currval,"
					+ " 0, 0 )"; // 해당 게시글 정보를 Insert하기
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bName);
			preparedStatement.setString(2, bTitle);
			preparedStatement.setString(3, bContent);
			
			// 쿼리문에 의해 DB애 변화가 있을때 executeUpdate를 호출한다.
			int rn = preparedStatement.executeUpdate();
			System.out.println("INSERT 결과: " + rn);
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
	
	// 게시글을 삭제하여 DELETE하기
	public void delete(String bId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();

			String query = "DELETE FROM mvc_board "
					+ "WHERE bId = ?"; // 해당 게시글 정보를 DELETE하기
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(bId));
			
			int rn = preparedStatement.executeUpdate();
			System.out.println("DELETE 결과: " + rn);
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
	
	// 게시글을 수정하여 UPDATE하기
	public void modify(String bId, String bName, String bTitle, String bContent) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();

			String query = "UPDATE mvc_board "
					+ "SET bName = ?, bTitle = ?, bContent = ? "
					+ "WHERE bId = ?"; // 해당 게시글 정보를 UPDATE하기
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bName);
			preparedStatement.setString(2, bTitle);
			preparedStatement.setString(3, bContent);
			preparedStatement.setInt(4, Integer.parseInt(bId));
			
			int rn = preparedStatement.executeUpdate();
			System.out.println("UPDATE 결과: " + rn);
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