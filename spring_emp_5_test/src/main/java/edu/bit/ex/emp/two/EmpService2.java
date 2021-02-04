package edu.bit.ex.emp.two;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.bit.ex.emp.vo.EmpVO;

@Service
public class EmpService2 {
	@Inject
	SqlSession sqlSession;

	public List<EmpVO> selectEmpList() throws Exception {
		return sqlSession.selectList("emp.selectEmpList");
	}
}
