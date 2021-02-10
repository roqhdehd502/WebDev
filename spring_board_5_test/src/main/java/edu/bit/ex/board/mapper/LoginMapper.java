package edu.bit.ex.board.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import edu.bit.ex.board.vo.UserVO;

//@Mapper // root-context내 my-batis 매퍼 경로 지정이 없을시 사용
@Mapper
public interface LoginMapper {
	// 지정할 변수가 2개 이상인 경우 파라미터를 설정한다.
	@Select("select * from users where username = #{username} and password = #{password}")
	public UserVO logInUser(@Param("username") String username, @Param("password") String password);
}