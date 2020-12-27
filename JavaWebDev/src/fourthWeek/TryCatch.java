package fourthWeek;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.println("a/b...a? ");
			int n1 = kb.nextInt();
			System.out.println("a/b..b? ");
			int n2 = kb.nextInt();
			System.out.printf("%d / %d = %d \n", n1, n2, (n1 / n2)); // 예외 발생 지점
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Good bye~~!");
	}
}