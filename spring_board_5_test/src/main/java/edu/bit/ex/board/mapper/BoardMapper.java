package edu.bit.ex.board.mapper;

import java.util.List;

import edu.bit.ex.board.page.Criteria;
import edu.bit.ex.board.vo.BoardVO;

public interface BoardMapper {

	// 게시글 불러오기
	public List<BoardVO> getList();

	// 페이징을 적용한 게시글 불러오기
	public List<BoardVO> getListWithPaging(Criteria criteria);

	// 페이징이 적용되는 게시글 수 단위
	public int getTotalCount(Criteria criteria);

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