package edu.bit.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import edu.bit.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
	// 게시글 불러오기
	@Select("SELECT bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent FROM mvc_board ORDER BY bGroup DESC, bStep ASC")
	public List<BoardVO> getList();

	// 작성글 불러오기
	@Select("SELECT * FROM mvc_board WHERE bId = #{bno}")
	public BoardVO read(int bno);

	// 조회수 증가
	@Update("UPDATE mvc_board SET bHit = bHit+1 WHERE bId = #{bId}")
	public void upHit(int bno);

	// 답변글 작성페이지 이동
	@Select("SELECT * FROM mvc_board WHERE bId = #{bno}")
	public BoardVO readReply(int bno);

	// 답변글 작성하기
	@Insert("INSERT INTO mvc_board (bId, bName, bTitle, bContent, bGroup, bStep, bIndent) VALUES (mvc_board_seq.nextval, #{bName}, #{bTitle},#{bContent}, #{bGroup}, #{bStep}+1, #{bIndent}+1)")
	public void reply(BoardVO boardVO);

	// 답변글 형태 업데이트하기
	@Update("UPDATE mvc_board SET bStep = bStep + 1 WHERE bGroup = #{bGroup}")
	public void replyShape(BoardVO boardVO);
}