package edu.bit.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Service
public class BoardService {
	private BoardMapper mapper;

	// 게시글 리스트
	public List<BoardVO> getList() {
		log.info("getList...");
		return mapper.getList();
	}

	// 작성글 페이지
	@Transactional
	public BoardVO getBoard(int bno) {
		mapper.upHit(bno);
		log.info("getBoard()");
		return mapper.read(bno);
	}

	// 답글 페이지
	public BoardVO getReply(int bno) {
		log.info("getBoard()");
		return mapper.readReply(bno);
	}

	// 답글 수행
	@Transactional
	public void replyBoard(BoardVO boardVO) {
		mapper.reply(boardVO);
		mapper.replyShape(boardVO);
		log.info("replyBoard()");
	}
}