package edu.bit.board.mapper;

import java.util.List;

import edu.bit.board.vo.BoardVO;

// 해당 인터페이스의 메소드는 BoardMapper.xml의 id로 넘어간다
public interface BoardMapper {

	public List<BoardVO> getList();

	public void insert(BoardVO boardVO);

	// public BoardVO read(int bno);

	// public void updateShape(BoardVO boardVO);

	// public void insertReply(BoardVO boardVO);

	// public void insertBoard(BoardVO boardVO);

	// public int delete(int bId);

	// public List<BoardVO> getListWithPaging(Criteria cri);

	// public int getTotalCount(Criteria cri);

	/*
	 * public List<BoardVO> getListWithPaging(Criteria cri);
	 * 
	 * public Integer insertSelectKey(BoardVO board);
	 * 
	 * public BoardVO read(Long bno);
	 * 
	 * public int delete(Long bno);
	 * 
	 * public int update(BoardVO board);
	 * 
	 * public int getTotalCount(Criteria cri);
	 */
}