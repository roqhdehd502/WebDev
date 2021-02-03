package edu.bit.ex.caculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.bit.ex.calculator.Calculator;

// TDD(Test Driven Development)
// Junit 단위 테스트 객체
public class CalculatorTest {
	@Autowired // Injection
	Calculator calculator;

	@Test
	public void testCalculator() { // Calculator 객체에 대한 테스트
		assertNotNull(calculator);
	}

	@Test
	public void testSum() { // sum 메소드에 대한 테스트
		Calculator cal = new Calculator();
		int result = cal.sum(10, 20);
		// 입력 값 대조를 통해 Junit Test를 Run하면
		// 맞으면 초록색 표시, 어긋나면 붉은색 표시가 뜬다.
		assertEquals(20, result, 10);
	}

	@Test
	public void testSub() { // sub 메소드에 대한 테스트
		Calculator cal = new Calculator();
		int result = cal.sub(10, 20);

		assertEquals(-10, result);
	}
}