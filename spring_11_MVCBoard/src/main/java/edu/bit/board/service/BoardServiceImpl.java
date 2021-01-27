package edu.bit.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.board.mapper.BoardMapper;
import edu.bit.board.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	private BoardMapper mapper;

	// 게시글 리스트
	@Override
	public List<BoardVO> getList() {
		log.info("getList()");
		return mapper.getList();
	}

	// 글작성 페이지
	@Override
	public void writeBoard(BoardVO boardVO) {
		mapper.insert(boardVO);
		log.info("writeBoard()");
	}

	// 작성글 페이지
	@Override
	public BoardVO getBoard(int bno) {
		mapper.upHit(bno);
		log.info("getBoard()");
		return mapper.read(bno);
	}

	// 작성글 삭제
	@Override
	public void deleteBoard(BoardVO boardVO) {
		mapper.delete(boardVO);
		log.info("deleteBoard()");
	}

	// 작성글 수정
	@Override
	public void modifyBoard(BoardVO boardVO) {
		mapper.modify(boardVO);
		log.info("modifyBoard()");
	}

	// 답글 페이지
	@Override
	public BoardVO getReply(int bno) {
		log.info("getBoard()");
		return mapper.readReply(bno);
	}

	// 답글 수행
	@Override
	public void replyBoard(BoardVO boardVO) {
		mapper.reply(boardVO);
		mapper.replyShape(boardVO);
		log.info("replyBoard()");
	}
}