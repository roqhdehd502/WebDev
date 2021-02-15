package edu.bit.ex.board.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// context xml파일에서 auto proxy 기능이 되었는지 확인한다!
@Component
@Aspect
public class LogAop2 {
	@Around("within(edu.bit.ex.board.service.*)")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr + " is start.");

		long st = System.currentTimeMillis();

		try {
			Object obj = joinpoint.proceed();
			return obj;
		} finally {

			long et = System.currentTimeMillis();

			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 경과시간 : " + (et - st));
		}

	}
}