package fourthWeek.rec;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		char sign = 0;
		
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		
		try {
			a = scanner.nextInt();
			sign = scanner.next().charAt(0);
			b = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("올바르지 않은 값 입니다. 다시 입력해주세요!");
		}
		
		Calc add = new Add(a, b);
		Calc sub = new Sub(a, b);
		Calc mul = new Mul(a, b);
		Calc div = new Div(a, b);
		
		switch (sign) {
		case '+':
			System.out.println(add.calculate());
			break;
		case '-':
			System.out.println(sub.calculate());
			break;
		case '*':
			System.out.println(mul.calculate());
			break;
		case '/':
			System.out.println(div.calculate());
			break;
		}
		
		scanner.close();
	}
}