package edu.bit.ex.dao;

import java.sql.*;
import java.util.ArrayList;
import edu.bit.ex.vo.EmpVO;

public class EmpDAO {
   
   private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 기본적으로 이 3개를 복사
   private String uid = "scott";
   private String upw = "tiger";

   public EmpDAO() { // 생성자 만듬 
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 JDBC 드라이버 로드
      } catch (Exception e) {

      }
   }

   public ArrayList<EmpVO> empSelect() {
      ArrayList<EmpVO> dtos = new ArrayList<EmpVO>();

      Connection con = null; // DB 연결 및 초기화
      Statement stmt = null; // 쿼리문 선언 및 초기화
      ResultSet rs = null; // DB 연결 해제 및 초기화

      try {
         con = DriverManager.getConnection(url, uid, upw); // DB 연결
         stmt = con.createStatement(); // SQL문 실행
         rs = stmt.executeQuery("select * from emp order by ename"); // 쿼리문을 통해 해당 데이터를 갖고 옴

         while (rs.next()) { 
            String name = rs.getString("ename");
            int empno = rs.getInt("empno");
            String job = rs.getString("job");

            EmpVO eDto = new EmpVO(name, empno, job);
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

}