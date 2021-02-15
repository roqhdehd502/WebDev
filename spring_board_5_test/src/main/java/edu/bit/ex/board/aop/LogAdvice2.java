package edu.bit.ex.board.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// context xml파일에서 auto proxy 기능이 되었는지 확인한다!
@Component
@Aspect
public class LogAdvice2 {
	@Before("within(edu.bit.ex.board.service.*)")
	public void printLogging() {
		System.out.println("=========로그기록Mk.2=========");
	}
}