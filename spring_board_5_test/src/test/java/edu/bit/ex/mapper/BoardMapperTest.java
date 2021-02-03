package edu.bit.ex.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.bit.ex.board.mapper.BoardMapper;
import edu.bit.ex.board.vo.BoardVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

// BoardMapper 단위 테스트
public class BoardMapperTest {
	@Setter(onMethod_ = @Autowired) // Injection
	private BoardMapper boardMapper;

	// boardMapper 클래스 테스트
	@Test
	public void testBoardMapper() {
		log.info("BoardMapper: " + boardMapper);
		assertNotNull(boardMapper);
	}

	// getList 테스트
	@Test
	public void testGetList() {
		List<BoardVO> list = boardMapper.getList();
		log.info(boardMapper);
		for (BoardVO boardVO : list) {
			log.info(boardVO.getbContent());
		}
	}

	// deleteBoard 테스트
	@Test
	public void testDeleteBoard() {
		BoardVO boardVO = new BoardVO();
		boardMapper.delete(boardVO);
		log.info(boardVO);
	}
}