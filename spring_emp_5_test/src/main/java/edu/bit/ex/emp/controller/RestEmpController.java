package edu.bit.ex.emp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.bit.ex.emp.service.EmpService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@RestController
@RequestMapping("/restful/*")
public class RestEmpController {
	private EmpService empService;

	@GetMapping("/emp")
	public ModelAndView list(ModelAndView mav) {
		mav.setViewName("rest/emp_list");
		mav.addObject("list", empService.getList());
		return mav;
	}
}