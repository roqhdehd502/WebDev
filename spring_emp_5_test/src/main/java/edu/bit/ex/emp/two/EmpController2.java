package edu.bit.ex.emp.two;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class EmpController2 {
	@Inject
	EmpService2 service;

	@GetMapping("/emp/list_two")
	public String list(Model model) throws Exception {
		model.addAttribute("list", service.selectEmpList());
		log.info("list()");

		return "emp/list";
	}
}