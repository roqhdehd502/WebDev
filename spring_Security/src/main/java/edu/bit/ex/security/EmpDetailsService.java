package edu.bit.ex.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.EmpMapper;
import edu.bit.ex.vo.EmpUser;
import edu.bit.ex.vo.EmpVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service

// 스프링 시큐리티의 UserDetailsService의 인터페이스 구현
public class EmpDetailsService implements UserDetailsService {
	@Setter(onMethod_ = @Autowired)
	private EmpMapper empMapper;

	@Override
	public UserDetails loadUserByUsername(String ename) throws UsernameNotFoundException {
		log.warn("Load User By EmpVO number: " + ename);
		EmpVO vo = empMapper.getEmp(ename);

		log.warn("Query by EmpVO mapper: " + vo);
		return vo == null ? null : new EmpUser(vo);
	}
}