package edu.bit.board.service;

import java.util.List;

import edu.bit.board.vo.BoardVO;

public interface BoardService {
	// public void writeReply(BoardVO board);

	// public BoardVO get(int bno);

	// public boolean modify(BoardVO board);

	// public boolean remove(Long bno);

	public List<BoardVO> getList();

	public void writeBoard(BoardVO boardVO);

	// public int remove(int bId);

	// public int getTotal(Criteria cri);
	// public List<BoardVO> getList(Criteria criteria);
}
