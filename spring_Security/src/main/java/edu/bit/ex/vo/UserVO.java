package edu.bit.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
@Setter
@AllArgsConstructor
public class UserVO {
	private String username; // id
	private String password; // pw
	private int enabled; // 계정 활성화 여부(1: 활성화, 0: 비활성화)

	public UserVO() {
		this("user", "1111", 1);
	}
}