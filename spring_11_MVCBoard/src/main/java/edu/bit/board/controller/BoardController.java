package edu.bit.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
public class BoardController {

	private BoardService boardService;

	@GetMapping("/list")
	public void list(Model model) {
		log.info("list()");
		model.addAttribute("list", boardService.getList());
	}

	@GetMapping("/write_view")
	public String write_view(Model model) {
		log.info("write_view()");
		return "/write_view";
	}

	@PostMapping("/write")
	public String write(BoardVO boardVO, Model model) throws Exception {
		log.info("write()");
		boardService.writeBoard(boardVO);
		return "redirect:list";
	}
	/*
	 * @GetMapping("/list3") public void list2(Criteria cri, Model model) { log.info("list3"); log.info(cri); model.addAttribute("list",
	 * boardService.getList(cri));
	 * 
	 * int total = boardService.getTotal(cri); log.info("total" + total);
	 * 
	 * model.addAttribute("pageMaker", new PageDTO(cri,total)); }
	 * 
	 * @RequestMapping("/content_view") public String content_view(BoardVO boardVO,Model model) throws Exception{ log.info("content_view");
	 * model.addAttribute("content_view", boardService.get(boardVO.getbId())); return "content_view"; }
	 * 
	 * @RequestMapping("/reply_view") public String reply_view(BoardVO boardVO, Model model) throws Exception{ log.info("reply_view()");
	 * model.addAttribute("reply_view", boardService.get(boardVO.getbId())); return "reply_view"; }
	 * 
	 * @RequestMapping("/reply") public String reply(BoardVO boardVO, Model model) throws Exception {
	 * 
	 * log.info("reply()"); boardService.writeReply(boardVO);
	 * 
	 * return "redirect:list"; } //ajax 遺�遺�
	 * 
	 * @RequestMapping("/rest/list") public String restList() {
	 * 
	 * log.info("rest/list");
	 * 
	 * return "ajaxList"; }
	 * 
	 * //jquery list
	 * 
	 * @GetMapping("/jquerylist") public String jquerylist(Model model) { log.info("jquerylist"); model.addAttribute("list", boardService.getList());
	 * return "jqueryList"; }
	 * 
	 * @GetMapping("/security") public String security(Model model) { return "security/index"; }
	 */
}