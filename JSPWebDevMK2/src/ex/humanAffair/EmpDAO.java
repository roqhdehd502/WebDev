package ex.humanAffair;

import java.sql.*;
import java.util.ArrayList;

public class EmpDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 기본적으로 이 3개를 복사
	private String uid = "scott";
	private String upw = "tiger";

	public EmpDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 JDBC 드라이버 로드
		} catch (Exception e) {

		}
	}

	public ArrayList<EmpDTO> empSelect() { // 직원 정보 출력
		ArrayList<EmpDTO> dtos = new ArrayList<EmpDTO>();

		Connection con = null; // DB 연결 및 초기화
		Statement stmt = null; // 쿼리문 선언 및 초기화
		ResultSet rs = null; // DB 연결 해제 및 초기화

		try {
			con = DriverManager.getConnection(url, uid, upw); // DB 연결
			stmt = con.createStatement(); // SQL문 실행
			rs = stmt.executeQuery("select e.empno as 사원번호,\r\n" // 사원번호
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
					+ "order by e.ename"); // 쿼리문을 통해 해당 데이터를 갖고 옴

			while (rs.next()) { 
				int empno = rs.getInt("empno"); // 사원번호
				String ename = rs.getString("ename"); // 사원이름
				String job = rs.getString("job"); // 사원직급
				int mgr = rs.getInt("mgr"); // 상사
				Timestamp rDate = rs.getTimestamp("rDate"); // 입사일
				int sal = rs.getInt("sal"); // 급여
				int comm = rs.getInt("comm"); // 커미션(성과급)
				int deptno = rs.getInt("deptno"); // 부서번호
				String dname = rs.getString("dname"); // 부서이름
				String loc = rs.getString("loc"); // 부서위치

				EmpDTO eDto = new EmpDTO(empno, ename, job,
						mgr, rDate, sal,
						comm, deptno, dname, loc);
				dtos.add(eDto); //어레이 리스트로 관리 
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally { // 디비의 내용을 모두 출력하면 연결 해제
			try {
				if (rs != null) rs.close();
				if(stmt != null) stmt.close();
				if (con != null) con.close(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	public void empInsert(EmpDTO dto) { // 직원 정보 입력
		// 두 테이블에 걸쳐서 insert를 어떻게 해야하나...
	}
}