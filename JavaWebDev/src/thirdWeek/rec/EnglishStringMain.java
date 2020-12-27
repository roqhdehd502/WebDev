package thirdWeek.rec;

import java.util.Scanner;

public class EnglishStringMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("영어 문자열을 입력해주세요: ");
		String input = scanner.next();
		
		EnglishString engstr = new EnglishString(input);
		
		engstr.show();
		
		scanner.close();
	}
}