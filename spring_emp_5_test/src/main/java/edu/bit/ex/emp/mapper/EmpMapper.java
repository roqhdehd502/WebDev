package edu.bit.ex.emp.mapper;

import java.util.List;

import edu.bit.ex.emp.page.Criteria;
import edu.bit.ex.emp.vo.EmpVO;

public interface EmpMapper {
	// 직원 정보 불러오기
	public List<EmpVO> getList();

	// 페이징을 적용한 직원 정보 불러오기
	public List<EmpVO> getListWithPaging(Criteria criteria);

	public int getTotalCount(Criteria criteria);

	// 직급 정보 불러오기
	public List<EmpVO> jobList();

	// 상사 정보 불러오기
	public List<EmpVO> mgrList();

	// 부서 정보 불러오기
	public List<EmpVO> deptList();

	// 위치 정보 불러오기
	public List<EmpVO> locList();

	// 직원 정보 입력하기
	public void insert(EmpVO empVO);

}