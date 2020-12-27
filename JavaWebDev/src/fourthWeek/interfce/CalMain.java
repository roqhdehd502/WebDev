package fourthWeek.interfce;

import java.util.Scanner;

public class CalMain { // CalMain에서 Calculator 테스트하는 프로그램을 작성하시오.
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ICalculate ical = new Calculator();
		
		System.out.println("계산할 정수 두 개를 띄어써서 입력해주세요.");
		System.out.println("ex) 3 4");
		
		try {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			System.out.println(ical.add(x, y));
			System.out.println(ical.sub(x, y));
			System.out.println(ical.mul(x, y));
			System.out.println(ical.div(x, y));
		} catch (Exception e) {
			System.out.println("올바르지 않은 입력 값 입니다!");
		}
		
		scanner.close();
	}
}