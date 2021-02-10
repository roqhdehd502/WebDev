package edu.bit.ex.board.service;

import edu.bit.ex.board.vo.UserVO;

public interface LoginService {
	public UserVO loginUser(String id, String pw);
}