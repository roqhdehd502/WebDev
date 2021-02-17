package edu.bit.ex.board.service;

import java.util.HashMap;

public interface KakaoService {
	String getAccessToken(String code);

	HashMap<String, Object> getUserInfo(String access_Token);
}
