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
						 + "ORDER BY bGroup DESC, bStep ASC"; // 게시글 정렬(답글이 달려도 원본글이 우선으로!)
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
		upHit(bId);
		
		BDto dtos = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "SELECT * "
						 + "FROM mvc_board "
						 + "WHERE bId = ?"; // 해당 게시글 번호를 조회
			preparedStatement = connection.prepareStatement(query);
			// '?' Wild Card로 넘어온것을 순서대로 담는다.
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

			String query = "INSERT INTO mvc_board (bId, bName,"
							+ " bTitle, bContent,"
							+ " bHit, bGroup,"
							+ " bStep, bIndent) "
						 + "VALUES (mvc_board_seq.nextval, ?,"
							+ " ?, ?,"
							+ " 0, mvc_board_seq.currval,"
							+ " 0, 0 )"; // 해당 게시글 정보를 Insert하기
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bName);
			preparedStatement.setString(2, bTitle);
			preparedStatement.setString(3, bContent);
			
			// 쿼리문에 의해 DB에 변화가 있을때 호출한다.
			// executeUpdate는 DB가 갱신된 횟수를 카운트하여 해당 값을 리턴한다.
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
	
	// SELECT하여 답글 구현
	public BDto reply_view(String bId) {
		BDto dtos = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "SELECT * "
						 + "FROM mvc_board "
						 + "WHERE bId = ?"; // 해당 답글을 조회
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
	            
	            dtos = new BDto(id, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
	         }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	// INSERT하여 답변을 게시물에 추가한다.
	public void reply(String bId, String bName, String bTitle,
			String bContent, String bGroup, String bStep, String bIndent) {
		replyShape(bGroup, bStep);
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			String query = "INSERT INTO mvc_board (bId, bName, bTitle,"
								+ " bContent, bGroup, bStep, bIndent) "
					     + "VALUES (mvc_board_seq.nextval, ?, ?,"
					     		+ " ?, ?, ?, ?)"; // INSERT로 답변을 게시물에 추가한다.
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, bName);
            preparedStatement.setString(2, bTitle);
            preparedStatement.setString(3, bContent);
            preparedStatement.setInt(4, Integer.parseInt(bGroup));
            // 답변을 추가할 때마다 답변의 줄이 한칸씩 추가된다.
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
	
	// 답변 형태 구현
	private void replyShape(String strGroup, String strStep) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "UPDATE mvc_board "
						 + "SET bStep = bStep + 1 " // 답변줄을 하나 추가한다
						 + "WHERE bGroup = ? " // 해당 게시글 그룹에 해당되어
						 	+ "AND bStep > ?"; // 추가할 답변 수가 기존 답변줄의 수보다 더 적다는 조건하에
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(strGroup));
			preparedStatement.setInt(2, Integer.parseInt(strStep));
			
			int rn = preparedStatement.executeUpdate();
			System.out.println("replyShape 반환 결과: " + rn);
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
	
	// 조회수 카운팅 구현
	private void upHit(String bId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "UPDATE mvc_board "
					     + "SET bHit = bHit + 1 "
					     + "WHERE bId = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bId);
			
			int rn = preparedStatement.executeUpdate();
			System.out.println("upHit 반환 결과: " + rn);				
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