package secondWeek;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("경우의 수에 입력할 서로 다른 사건의 수와, 이에 대한 가짓 수를 입력하세요.");
		System.out.println();
		
		System.out.print("개수: ");
		int num = scanner.nextInt();
		System.out.print("가짓 수: ");
		int rel = scanner.nextInt();
		System.out.println();
		
		System.out.print("팩토리얼의 값은 " + getFactorial(num) + "이고, ");
		System.out.print("순열의 값은 " + getPermutation(num, rel) + "이며, ");
		System.out.println("조합의 값은 " + getCombination(num, rel) + "입니다.");
		
		scanner.close();
	}

	private static int getCombination(int num, int rel) { // 조합
		return getPermutation(num, rel) / getFactorial(rel);
	}

	private static int getPermutation(int num, int rel) { // 순열
		return getFactorial(num) / getFactorial(num - rel);
	}

	private static int getFactorial(int num) { // 팩토리얼
		if (num <= 1) {
			return num;
		} else {
			return getFactorial(num - 1) * num;
		}
	}
}