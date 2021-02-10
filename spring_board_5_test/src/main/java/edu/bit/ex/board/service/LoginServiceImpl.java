package edu.bit.ex.board.service;

import org.springframework.stereotype.Service;

import edu.bit.ex.board.mapper.LoginMapper;
import edu.bit.ex.board.vo.UserVO;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoginServiceImpl implements LoginService {
	LoginMapper loginMapper;

	@Override
	public UserVO loginUser(String id, String pw) {
		return loginMapper.logInUser(id, pw);
	}
}