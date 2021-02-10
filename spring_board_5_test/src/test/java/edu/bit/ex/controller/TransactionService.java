package edu.bit.ex.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.bit.ex.board.mapper.BoardMapper;
import edu.bit.ex.board.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class TransactionService {
	private BoardMapper mapper;

	public void transionTest1() {
		log.info("transionTest1()테스트 ");
		BoardVO boardVO = new BoardVO();
		boardVO.setbContent("트랜잭션1");
		boardVO.setbName("트랜잭션1");
		boardVO.setbTitle("트랜잭션1");

		mapper.insertBoard(boardVO);

		boardVO.setbContent("트랜잭션2");
		boardVO.setbName("트랜잭션2");
		boardVO.setbTitle("트랜잭션2");

		mapper.insertBoard(boardVO);
	}

	public void transionTest2() {
		log.info("transionTest2()테스트 ");
		BoardVO boardVO = new BoardVO();
		boardVO.setbContent("트랜잭션1");
		boardVO.setbName("트랜잭션1");
		boardVO.setbTitle("트랜잭션1");

		mapper.insertBoard(boardVO);

		boardVO.setbContent("트랜잭션2");
		boardVO.setbName("트랜잭션2");
		boardVO.setbTitle("트랜잭션2");

		// 고의로 트랙잭션 유발한다.
		boardVO = null;
		mapper.insertBoard(boardVO);
	}

	@Transactional // 트랜잭션 기능의 어노테이션 생성
	public void transionTest3() {
		log.info("transionTest3()테스트 ");
		BoardVO boardVO = new BoardVO();
		boardVO.setbContent("트랜잭션1");
		boardVO.setbName("트랜잭션1");
		boardVO.setbTitle("트랜잭션1");

		mapper.insertBoard(boardVO);

		boardVO.setbContent("트랜잭션2");
		boardVO.setbName("트랜잭션2");
		boardVO.setbTitle("트랜잭션2");

		boardVO = null;
		mapper.insertBoard(boardVO);
	}

	// 예외 처리를 직접하여 에러가 나면 롤백기능 수행
	@Transactional(rollbackFor = Exception.class)
	public void transionTest4() {
		log.info("transionTest4()테스트 ");
		BoardVO boardVO = new BoardVO();
		boardVO.setbContent("트랜잭션4");
		boardVO.setbName("트랜잭션4");
		boardVO.setbTitle("트랜잭션4");

		mapper.insertBoard(boardVO);
		// 에러메시지 출력
		// 런타임 에러외의 예외처리는 반드시 개발자가 처리해야한다!!!
		throw new RuntimeException("RuntimeException for rollback.");
	}

	// CheckedExeption 테스트(롤백 안함)
	//
	@Transactional
	public void transionTest5() throws SQLException {

		BoardVO boardVO = new BoardVO();
		boardVO.setbContent("트랜잭션5");
		boardVO.setbName("트랜잭션5");
		boardVO.setbTitle("트랜잭션5");

		mapper.insertBoard(boardVO);

		throw new SQLException("SQLException for rollback");
	}

	// @Transactional의 rollbackFor 옵션을 이용하면 Rollback이 되는 클래스를 지정가능함.
	// Exception예외로 롤백을 하려면 다음과 같이 지정하면됩니다.
	// @Transactional(rollbackFor = Exception.class)
	// 여러개의 예외를 지정할 수도 있습니다. @Transactional(rollbackFro = {RuntimeException.class, Exception.class})
	@Transactional(rollbackFor = Exception.class)
	public void transionTest6() throws SQLException {
		BoardVO boardVO = new BoardVO();
		boardVO.setbContent("트랜잭션6");
		boardVO.setbName("트랜잭션6");
		boardVO.setbTitle("트랜잭션6");

		mapper.insertBoard(boardVO);

		throw new SQLException("SQLException for rollback");
	}

	@Transactional(rollbackFor = SQLException.class)
	public void transionTest7() throws SQLException {
		BoardVO boardVO = new BoardVO();
		boardVO.setbContent("트랜잭션7");
		boardVO.setbName("트랜잭션7");
		boardVO.setbTitle("트랜잭션7");

		mapper.insertBoard(boardVO);

		throw new SQLException("SQLException for rollback");
	}

}