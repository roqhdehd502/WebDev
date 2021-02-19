package edu.bit.ex.mapper;

import org.apache.ibatis.annotations.Insert;

import edu.bit.ex.vo.UserVO;

public interface UserMapper {
	// 유저 정보 입력
	@Insert("insert into users(username,password,enabled) values(#{username},#{password},#{enabled})")
	public int insertUser(UserVO userVO);

	// 검증 정보 입력
	@Insert("insert into AUTHORITIES (username,AUTHORITY) values(#{username},'ROLE_USER')")
	public void insertAuthorities(UserVO UserVO);
}