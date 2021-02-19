package edu.bit.ex.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

// 스프링 시큐리티의 User 객체 상속
public class MemberUser extends User {
	private MemberVO member;

	// 기본적으로 부모의 생성자를 호출해야만 정상적으로 작동
	// 기본적으로 username, password, authorities 3요소를 기준으로 한다
	public MemberUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

	// loadUserByUsername의 리턴할때의 생성자 메소드

	public MemberUser(MemberVO memberVO) {
		super(memberVO.getUsername(), memberVO.getPassword(), getAuth(memberVO));
		this.member = memberVO;
	}

	// 유저가 갖고 있는 권한 목록
	public static Collection<? extends GrantedAuthority> getAuth(MemberVO memberVO) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (AuthVO auth : memberVO.getAuthList()) {
			authorities.add(new SimpleGrantedAuthority(auth.getAuthority()));
		}
		return authorities;
	}
}