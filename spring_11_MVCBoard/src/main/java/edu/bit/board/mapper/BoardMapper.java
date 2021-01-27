package edu.bit.board.mapper;

import java.util.List;

import edu.bit.board.vo.BoardVO;

// 해당 인터페이스의 메소드는 BoardMapper.xml의 id로 넘어간다
public interface BoardMapper {
	// 게시글 불러오기
	public List<BoardVO> getList();

	// 글 작성하기
	public void insert(BoardVO boardVO);

	// 작성글 불러오기
	public BoardVO read(int bno);

	// 조회수 증가
	public void upHit(int bno);

	// 작성글 삭제하기
	public void delete(BoardVO boardVO);

	// 작성글 수정하기
	public void modify(BoardVO boardVO);

	// 답변글 작성페이지 이동
	public BoardVO readReply(int bno);

	// 답변글 작성하기
	public void reply(BoardVO boardVO);

	// 답변글 형태 업데이트하기
	public void replyShape(BoardVO boardVO);
}