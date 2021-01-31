package edu.bit.ex.emp.service;

import java.util.List;

import edu.bit.ex.emp.vo.EmpVO;

public interface EmpService {
	// 직원정보 리스트
	public List<EmpVO> getList();

	// 직급 정보 불러오기
	public List<EmpVO> jobList();

	// 상사 정보 불러오기
	public List<EmpVO> mgrList();

	// 부서 정보 불러오기
	public List<EmpVO> deptList();

	// 직원 정보 작성하기
	public void writeEmp(EmpVO empVO);
}