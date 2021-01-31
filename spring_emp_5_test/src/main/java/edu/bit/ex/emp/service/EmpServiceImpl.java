package edu.bit.ex.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.ex.emp.mapper.EmpMapper;
import edu.bit.ex.emp.vo.EmpVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class EmpServiceImpl implements EmpService {
	private EmpMapper mapper;

	// 직원 정보 리스트
	@Override
	public List<EmpVO> getList() {
		log.info("getList()");
		return mapper.getList();
	}

	// 직급 정보 불러오기
	@Override
	public List<EmpVO> jobList() {
		log.info("jobList()");
		return mapper.jobList();
	}

	// 상사 정보 불러오기
	@Override
	public List<EmpVO> mgrList() {
		log.info("mgrList()");
		return mapper.mgrList();
	}

	// 부서 정보 불러오기
	@Override
	public List<EmpVO> deptList() {
		log.info("deptList()");
		return mapper.deptList();
	}

	// 직원 정보 작성
	@Override
	public void writeEmp(EmpVO empVO) {
		mapper.insert(empVO);
		log.info("writeEmp()");
	}
}