package edu.bit.ex.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.bit.ex.service.BoardService;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@RestController
@RequestMapping("/restful/*")
public class BoardController {
	private BoardService boardService;

	// 게시글 리스트
	@GetMapping("/board")
	public ModelAndView list(ModelAndView mav) {
		mav.setViewName("rest/rest_list");
		mav.addObject("list", boardService.getList());
		return mav;
	}

	// 작성글 페이지
	@GetMapping("/board/{bId}")
	public ModelAndView rest_content_view(BoardVO boardVO, ModelAndView mav) {
		log.info("rest_content_view");
		mav.setViewName("rest/content_view");
		mav.addObject("content_view", boardService.getBoard(boardVO.getbId()));
		return mav;
	}

	// 답변글 페이지
	@GetMapping("/board/reply/{bId}")
	public ModelAndView rest_reply_view(BoardVO boardVO, ModelAndView mav) {
		log.info("rest_reply_view");
		mav.setViewName("rest/reply_view");
		mav.addObject("reply_view", boardService.getReply(boardVO.getbId()));
		return mav;
	}

	// 작성글 답변
	@PostMapping("/board/reply/{bId}")
	public ResponseEntity<String> rest_reply(@RequestBody BoardVO boardVO, ModelAndView modelAndView) {
		ResponseEntity<String> entity = null;

		log.info("rest_reply..");
		try {
			boardService.replyBoard(boardVO);
			entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

		return entity;
	}
}