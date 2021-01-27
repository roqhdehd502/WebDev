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

	@Override
	public List<BoardVO> getList() {
		log.info("getList()");
		return mapper.getList();
	}

	@Override
	public void writeBoard(BoardVO boardVO) {
		mapper.insert(boardVO);
		log.info("writeBoard()");
	}
	/*
	 * @Override public BoardVO get(int bno) { // TODO Auto-generated method stub log.info("get.........."); return mapper.read(bno); }
	 * 
	 * 
	 * @Override public void writeBoard(BoardVO boardVO) { // TODO Auto-generated method stub mapper.insertBoard(boardVO); }
	 * 
	 * @Override public void writeReply(BoardVO boardVO) { mapper.updateShape(boardVO); mapper.insertReply(boardVO);
	 * 
	 * }
	 * 
	 * @Override public int remove(int bId) { log.info("remove.........."); return mapper.delete(bId); }
	 * 
	 * @Override public int getTotal(Criteria cri) { log.info("get total count"); return mapper.getTotalCount(cri); }
	 * 
	 * @Override public List<BoardVO> getList(Criteria criteria) { log.info("get List with criteria" + criteria); return
	 * mapper.getListWithPaging(criteria); }
	 * 
	 */
}
