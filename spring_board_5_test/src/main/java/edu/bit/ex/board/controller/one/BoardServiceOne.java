package edu.bit.ex.board.controller.one;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.bit.ex.board.vo.BoardVO;

@Service
public class BoardServiceOne {
	@Inject
	SqlSession sqlSession;

	public List<BoardVO> selectBoardList() throws Exception {
		IBDAO dao = sqlSession.getMapper(IBDAO.class);

		return dao.listDAO();
	}
}