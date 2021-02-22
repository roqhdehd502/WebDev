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
public class KakaoAccount {

	private boolean profile_needs_agreement;
	private Profile profile;

}