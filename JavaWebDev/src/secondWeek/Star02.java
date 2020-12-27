package secondWeek;

import java.util.Scanner;

public class Star02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("쌓을 층수를 입력해주세요.");
		int num = scanner.nextInt();
		System.out.println();
		getStar(num);
		
		scanner.close();
	}

	private static void getStar(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
