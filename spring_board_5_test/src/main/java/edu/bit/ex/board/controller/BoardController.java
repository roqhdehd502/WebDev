package edu.bit.ex.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.bit.ex.board.page.Criteria;
import edu.bit.ex.board.page.PageVO;
import edu.bit.ex.board.service.BoardService;
import edu.bit.ex.board.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
public class BoardController {
	private BoardService boardService;

	// 게시글 리스트
	@GetMapping("/board/list")
	public void list(Model model) {
		log.info("list()");
		model.addAttribute("list", boardService.getList());
	}

	// 페이징을 적용한 게시글 리스트
	@Transactional
	@GetMapping("/board/list2")
	public void list2(Criteria cri, Model model) {
		log.info("list2()");
		log.info(cri);
		model.addAttribute("list", boardService.getList(cri));

		int total = boardService.getTotal(cri);
		log.info("total" + total);
		model.addAttribute("pageMaker", new PageVO(cri, total));
	}

	// Ajax를 이용한 게시글 리스트
	@GetMapping("/board/ajaxList")
	public void ajaxList(Model model) {
		log.info("ajaxList()");
	}

	// 글작성 페이지
	@GetMapping("/board/write_view")
	public String write_view(Model model) {
		log.info("write_view()");
		return "/board/write_view";
	}

	// 글작성
	@PostMapping("/board/write")
	public String write(BoardVO boardVO, Model model) throws Exception {
		log.info("write()");
		boardService.writeBoard(boardVO);
		return "redirect:list";
	}

	// 작성글 페이지
	@GetMapping("/board/content_view")
	public void content_view(BoardVO boardVO, Model model) throws Exception {
		log.info("content_view()");
		model.addAttribute("content_view", boardService.getBoard(boardVO.getbId()));
	}

	// 작성글 수정
	@PostMapping("/board/modify")
	public String modify(BoardVO boardVO, Model model) throws Exception {
		log.info("modify()");
		boardService.modifyBoard(boardVO);
		return "redirect:list";
	}

	// 작성글 삭제
	@GetMapping("/board/delete")
	public String delete(BoardVO boardVO, Model model) throws Exception {
		log.info("delete()");
		boardService.deleteBoard(boardVO);
		return "redirect:list";
	}

	// 작성글 답변 페이지
	@GetMapping("/board/reply_view")
	public String reply_view(BoardVO boardVO, Model model) throws Exception {
		log.info("reply_view()");
		model.addAttribute("reply_view", boardService.getReply(boardVO.getbId()));
		return "/board/reply_view";
	}

	// 작성글 답변
	@PostMapping("/board/reply")
	public String reply(BoardVO boardVO, Model model) throws Exception {
		log.info("reply()");
		boardService.replyBoard(boardVO);
		return "redirect:list";
	}

	// 로그인 페이지
	@GetMapping("/board/login_view")
	public String login_view(Model model) {
		log.info("login_view()");
		return "/board/login_view";
	}
}