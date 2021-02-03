package edu.bit.ex.emp.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.bit.ex.emp.vo.EmpVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class EmpMapperTest {
	@Setter(onMethod_ = @Autowired) // Injection
	private EmpMapper empMapper;

	// empMapper 클래스 테스트
	@Test
	public void testEmpMapper() {
		log.info("empMapper: " + empMapper);
		assertNotNull(empMapper);
	}

	// getList 테스트
	@Test
	public void testGetList() {
		List<EmpVO> list = empMapper.getList();

		log.info(empMapper);

		for (EmpVO empVO : list) {
			log.info(empVO.getEname());
		}
	}

	// EMP Update(더미) 테스트
	@Test
	public void testModify() {
		List<EmpVO> list = empMapper.getList();

		EmpVO empVO = new EmpVO();
		empMapper.modify(empVO);

		for (EmpVO emp : list) {
			log.info(emp.getEname());
		}
	}

}