package secondWeek.rec;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		outeroop:
		while (true) {
			System.out.println("계산할 정수 및 사칙연산기호를 띄어쓰기하여 입력해주십시오.");
			System.out.println("ex. 10 + 9 (or) 10 - 9 (or) 10 * 9 (or) 10 / 9");

			int num1 = scanner.nextInt();
			String sign = scanner.next();
			int num2 = scanner.nextInt();

			Calculator cal = new Calculator(num1, num2, sign);

			cal.setNum1(num1);
			cal.setNum2(num2);
			cal.setSign(sign);

			cal.show();
			
			inneroop:
			while (true) {
				System.out.println();
				System.out.print("다시 시작하시겠습니까? [Y / N]: ");
				char con = scanner.next().charAt(0);

				if (con == 'Y' || con == 'y') {
					System.out.println();
					System.out.println("프로그램을 다시 시작합니다.");
					System.out.println();
					break inneroop;
				} else if (con == 'N' || con == 'n') {
					System.out.println();
					System.out.println("프로그램을 종료합니다.");
					break outeroop;
				} else {
					System.out.println("올바르지 않은 입력 값 입니다. 다시 입력해주세요.");
					continue;
				}
			}
		}
		scanner.close();
	}
}