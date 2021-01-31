package edu.bit.ex.emp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.bit.ex.emp.service.EmpService;
import edu.bit.ex.emp.validator.EmpValidator;
import edu.bit.ex.emp.vo.EmpVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
public class EmpController {
	private EmpService empService;

	// 직원 리스트
	@GetMapping("/emp/list")
	public void list(Model model) throws Exception {
		model.addAttribute("list", empService.getList());
		log.info("list()");
	}

	// 직원 정보 작성 페이지
	@Transactional
	@GetMapping("/emp/write_view")
	public void write_view(Model model) throws Exception {
		model.addAttribute("jobList", empService.jobList());
		model.addAttribute("mgrList", empService.mgrList());
		model.addAttribute("deptList", empService.deptList());
		log.info("write_view()");
	}

	// 직원 정보 작성
	@PostMapping("/emp/write")
	public String write(@Valid EmpVO empVO, BindingResult result) {
		log.info("write()");

		String page = "redirect:list";
		EmpValidator validator = new EmpValidator();
		validator.validate(empVO, result);

		if (result.hasErrors()) {
			page = "reditect:write_view";
			List<FieldError> list = result.getFieldErrors();

			if (null != result.getFieldErrors()) {
				for (FieldError fe : result.getFieldErrors()) {
					log.info("Field: " + fe.getField());
					log.info("Code: " + fe.getCode());
					log.info("ObjectName: " + fe.getObjectName());
					log.info("RejectedValue: " + fe.getRejectedValue());
					log.info("DefaultMessage: " + fe.getDefaultMessage());
					// log.info("에러메시지: " + fe.getCode());
				}
			}
		}
		return page;
	}
}