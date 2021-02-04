package edu.bit.ex.board.controller.two;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.bit.ex.board.vo.BoardVO;

@Service
public class BoardServiceTwo {
	@Inject
	SqlSession sqlSession;

	public List<BoardVO> selectBoardList() throws Exception {
		return sqlSession.selectList("board.selectBoardList");
	}
}