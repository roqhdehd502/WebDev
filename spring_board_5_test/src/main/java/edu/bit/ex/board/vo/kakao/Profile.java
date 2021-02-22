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
public class Profile {

	private String nickname;
	private String thumbnail_image_url;
	private String profile_image_url;

}