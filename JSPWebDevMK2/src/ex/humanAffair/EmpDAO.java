package ex.humanAffair;

import java.sql.*;
import java.util.ArrayList;

public class EmpDAO {
	private Connection connection; // Connection
	private PreparedStatement pstmt; // PreStatement
	private ResultSet set; // Result Set
	
	String driver = "oracle.jdbc.driver.OracleDriver"; // 오라클 드라이버
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // DB url
	private String uid = "scott"; // DB id
	private String upw = "tiger"; // DB pw
	private String query; // 쿼리문
	
	private static EmpDAO instance = new EmpDAO();
	
	public static EmpDAO getInstance() { // 인스턴스 생성으로 싱글톤 패턴화
		return instance;
	}
	
	public int insertDept(EmpDTO dto) { // 부서 테이블 정보 추가
		int ri = 1;
		
		connection = null; // DB 연결 및 초기화
		pstmt = null; // 쿼리문 선언 및 초기화
		query = "INSERT INTO emp VALUES (?,?,?,?,?,?,?,?)"; // 쿼리문
		
		try {
			connection = getConnection();
			pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setString(3, dto.getJob());
			pstmt.setInt(4, dto.getMgr());
			pstmt.setTimestamp(5, dto.getrDate());
			pstmt.setInt(6, dto.getSal());
			pstmt.setInt(7, dto.getComm());
			pstmt.setInt(8, dto.getDeptno());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) { pstmt.close(); }
				if (connection != null) { connection.close(); }
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return ri;
	}
	
	public int insertEmp(EmpDTO dto) { // 직원 테이블 정보 추가
		int ri = 2;
		
		connection = null; // DB 연결 및 초기화
		pstmt = null; // 쿼리문 선언 및 초기화
		query = "INSERT INTO emp VALUES (?,?,?)"; // 쿼리문
		
		try {
			connection = getConnection();
			pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) { pstmt.close(); }
				if (connection != null) { connection.close(); }
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return ri;
	}
	
	public int empSelect() { // 직원 정보 가져오기
		int ri = 3;
		
		connection = null;
		pstmt = null;
		set = null;
		query = "select e.empno as 사원번호,\r\n" // 사원번호
				+ "    e.ename,\r\n" // 사원이름
				+ "    e.job,\r\n" // 직급
				+ "    nvl(e.mgr, 0),\r\n" // 상사
				+ "    e.hiredate,\r\n" // 입사일
				+ "    e.sal,\r\n" // 급여
				+ "    nvl(e.comm, 0),\r\n" // 커미션
				+ "    d.deptno,\r\n" // 부서번호
				+ "    d.dname,\r\n" // 부서이름
				+ "    d.loc\r\n" // 부서위치
				+ "from dept d, emp e\r\n"
				+ "where d.deptno = e.deptno\r\n"
				+ "order by e.ename";
		
		try {
			connection = getConnection();
			pstmt = connection.prepareStatement(query);
			set = pstmt.executeQuery();
			
			while (set.next()) { 
				int empno = set.getInt("empno"); // 사원번호
				String ename = set.getString("ename"); // 사원이름
				String job = set.getString("job"); // 사원직급
				int mgr = set.getInt("mgr"); // 상사
				Timestamp rDate = set.getTimestamp("rDate"); // 입사일
				int sal = set.getInt("sal"); // 급여
				int comm = set.getInt("comm"); // 커미션(성과급)
				int deptno = set.getInt("deptno"); // 부서번호
				String dname = set.getString("dname"); // 부서이름
				String loc = set.getString("loc"); // 부서위치
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				set.close();
				pstmt.close();
				connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return ri;
	}
	
	private Connection getConnection() { // DB 연결
		connection = null;
		
		try {
			Class.forName(driver); // driver 가져오기
			connection = DriverManager.getConnection(url, uid, upw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	/*
	public ArrayList<String> getManager() {
		ArrayList<EmpDTO> dtos = new ArrayList<EmpDTO>();
		
		Connection con = null;
		Statement stmt = null;
		
	}
	*/
}