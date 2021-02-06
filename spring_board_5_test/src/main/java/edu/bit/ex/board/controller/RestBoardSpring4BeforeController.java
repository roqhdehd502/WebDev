package edu.bit.ex.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.bit.ex.board.service.BoardService;
import edu.bit.ex.board.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

// 스프링4 이전의 JSON(@Controller + @ResponseBody)
@Log4j
@AllArgsConstructor
@Controller
public class RestBoardSpring4BeforeController {
	private BoardService boardService;

	@ResponseBody
	@GetMapping("/rest/before")
	public List<BoardVO> before(Model model) {
		log.info("before");
		List<BoardVO> list = boardService.getList();
		return list;
	}
}