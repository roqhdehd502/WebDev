package edu.bit.board.service;

import java.util.List;

import edu.bit.board.vo.BoardVO;

public interface BoardService {

	// 게시글 리스트
	public List<BoardVO> getList();

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