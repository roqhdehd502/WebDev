package edu.bit.ex.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.bit.ex.board.service.BoardService;
import edu.bit.ex.board.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

// 스프링4 이후의 JSON(@RestController)
// 해당 Controller의 모든 메서드의 리턴타입을 기존과 다르게 처리

@Log4j
@AllArgsConstructor
@RestController // JSON으로 리턴
@Controller
public class RestBoardSpring4AfterController2 {
	private BoardService boardService;

	// AJAX를 이용한 리스트 출력
	// 이 후 JSP의 url을 통해 정보를 가져온다.
	@RequestMapping("/rest/after")
	public List<BoardVO> after() {
		log.info("/rest/after");
		List<BoardVO> list = boardService.getList();
		return list;
	}

	// AJAX를 이용한 게시글 삭제
	@RequestMapping(value = "/rest/delete/{bId}", method = RequestMethod.DELETE)
	public int restDelete(@PathVariable("bId") int bId) {
		log.info("restDelete");
		return boardService.remove(bId);
	}
}