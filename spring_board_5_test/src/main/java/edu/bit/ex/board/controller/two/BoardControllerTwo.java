package edu.bit.ex.board.controller.two;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

/*
1. interface는 필요가 없음
2. sqlSession에서 제공하는 함수(selectList, selectOne)을 이용함
3. 쿼리구현을 위한 XML이 필요. 해당 XML의 namespace는 개발자가 정함
*/

@Log4j
@Controller
public class BoardControllerTwo {
	@Inject
	BoardServiceTwo service;

	@GetMapping("/board/list_two")
	public String list(Model model) throws Exception {
		model.addAttribute("list", service.selectBoardList());
		log.info("list()");

		return "board/list";
	}
}