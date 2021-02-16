package edu.bit.ex.emp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.bit.ex.emp.service.EmpService;
import edu.bit.ex.emp.vo.EmpVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@RestController
@RequestMapping("/restful/*")
public class RestEmpController2 {
	private EmpService empService;

	@RequestMapping("/rest/after")
	public List<EmpVO> after() {
		log.info("/rest/after");
		List<EmpVO> list = empService.getList();
		return list;
	}
}