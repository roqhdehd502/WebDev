package edu.bit.ex.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.MemberMapper;
import edu.bit.ex.vo.MemberUser;
import edu.bit.ex.vo.MemberVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service

// 스프링 시큐리티의 UserDetailsService의 인터페이스 구현
public class MemberDetailsService implements UserDetailsService {
	@Setter(onMethod_ = @Autowired)
	private MemberMapper memberMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.warn("Load User By MemberVO number: " + username);
		MemberVO vo = memberMapper.getMember(username);

		log.warn("queried by MemberVO mapper: " + vo);
		return vo == null ? null : new MemberUser(vo);
	}
}