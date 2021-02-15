package edu.bit.ex.board.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		// LogAdvice 객체 작동 시간을 측정하기 위해 Jointpoint를 이용한 변수 선언
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr + " is start.");
		// 시간 설정
		// 시작 시간을 설정한다(start time)
		long st = System.currentTimeMillis();

		// try ~ finally로 성능체크 기능을 구현한다.
		try {
			Object obj = joinpoint.proceed();
			return obj;
		} finally {
			// 종료 시간을 설정한다(end time)
			long et = System.currentTimeMillis();

			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 경과시간 : " + (et - st));
		}

	}
}