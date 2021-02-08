package edu.bit.ex.board.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.bit.ex.board.service.BoardService;
import edu.bit.ex.board.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

// REST: Representational State Tranfer
// 하나의 URI가 하나의 고유한 리소스를 대표하도록 설계된 개념

// http://localhost/spring02/list?bno=1 ==> url+파라미터
// http://localhost/spring02/list/1 ==> url

//RestController은 스프링 4.0부터 지원
//@Controller, @RestController 차이점은 메서드가 종료되면 화면전환의 유무

@Log4j
@AllArgsConstructor
@RestController
@RequestMapping("/restful/*")
public class RestBoardController {
	private BoardService boardService;

	// 1. list(처음 진입 화면이므로 화면이 깜박여도 상관없으므로
	// @Controller방식으로 접근 - view(화면)를 리턴
	@GetMapping("/board")
	public ModelAndView list(ModelAndView mav) {
		mav.setViewName("rest_list");
		mav.addObject("list", boardService.getList());
		return mav;
	}

	// 작성글 페이지
	@GetMapping("/board/{bId}")
	public ModelAndView rest_content_view(BoardVO boardVO, ModelAndView mav) {
		log.info("rest_content_view");
		mav.setViewName("content_view");
		mav.addObject("content_view", boardService.getBoard(boardVO.getbId()));
		// model.addAttribute("content_view", boardService.getBoard(boardVO.getbId()));
		return mav;
	}

	// 작성글 삭제
	// ResponseEntity: 개발자가 직접 결과 데이터와 HTTP 상태 코드를 제어할 수 있는 클래스
	@DeleteMapping("/board/{bId}")
	public ResponseEntity<String> rest_delete(BoardVO boardVO, Model model) {
		ResponseEntity<String> entity = null;
		log.info("rest_delete..");

		try {
			boardService.remove(boardVO.getbId());
			// 삭제가 성공하면 상태메시지 저장
			entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			// 댓글 삭제가 실패하면 BAD_REQUEST를 리턴
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		// 삭제 처리 HTTP 상태 메시지 리턴
		return entity;
	}
}