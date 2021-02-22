package edu.bit.ex.board.vo.kakao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KakaoProfile {

	private int id;
	private String connected_at;
	private Properties properties;
	private KakaoAccount kakao_account;

}
