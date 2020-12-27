package thirdWeek;

import java.util.Scanner;

public class Scannnner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str1 = scanner.nextLine();
		
		System.out.print("문자열 입력: ");
		String str2 = scanner.nextLine();
		
		System.out.printf("입력된 문자열 1: %s \n", str1);
		System.out.printf("입력된 문자열 2: %s \n", str2);
		
		scanner.close();
	}

}
