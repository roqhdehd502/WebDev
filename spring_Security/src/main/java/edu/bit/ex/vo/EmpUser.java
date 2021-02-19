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
public class EmpUser extends User {
	private EmpVO emp;

	public EmpUser(String ename, String empno, Collection<? extends GrantedAuthority> authorities) {
		super(ename, empno, authorities);
	}

	public EmpUser(EmpVO empVO) {
		super(empVO.getEname(), empVO.getEmpno(), getAuth(empVO));
		this.emp = empVO;
	}

	// 유저가 갖고 있는 권한 목록
	public static Collection<? extends GrantedAuthority> getAuth(EmpVO empVO) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (AuthVO auth : empVO.getAuthList()) {
			authorities.add(new SimpleGrantedAuthority(auth.getAuthority()));
		}
		return authorities;
	}
}