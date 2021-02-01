package edu.bit.ex.board.service;

import java.util.List;

import edu.bit.ex.board.page.Criteria;
import edu.bit.ex.board.vo.BoardVO;

public interface BoardService {

	// 게시글 리스트
	public List<BoardVO> getList();

	// 페이징 적용한 게시글 리스트
	public List<BoardVO> getList(Criteria criteria);

	// 페이징 단위에 적용되는 최대 게시글 단위
	public int getTotal(Criteria criteria);

	// 게시글 작성
	public void writeBoard(BoardVO boardVO);

	// 작성글 확인
	public BoardVO getBoard(int getbId);

	// 작성글 삭제
	public void deleteBoard(BoardVO boardVO);

	// 작성글 수정
	public void modifyBoard(BoardVO boardVO);

	// 답변글 작성 이동
	public BoardVO getReply(int getbId);

	// 답변글 작성
	public void replyBoard(BoardVO boardVO);

}