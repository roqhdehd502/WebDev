package edu.bit.ex.board.vo.kakao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KakaoAuth {
	private String access_token;
	private String token_type;
	private String refresh_token;
	private long expires_in;
	private String scope;
	private int refresh_token_expires_in;
}
