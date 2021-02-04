package edu.bit.ex.board.controller.one;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/*
1.interface IBDao를  XML namespace에 매핑 <mapper namespace="edu.bit.ex.one.IBDao"> 
2.sqlSession.getMapper(IBDao.class)를 이용.
*/

@Log4j
@AllArgsConstructor
@Controller
public class BoardControllerOne {
	@Inject
	BoardServiceOne service;

	@GetMapping("/board/list_one")
	public String list(Model model) throws Exception {
		model.addAttribute("list", service.selectBoardList());
		log.info("list()");

		return "board/list";
	}
}