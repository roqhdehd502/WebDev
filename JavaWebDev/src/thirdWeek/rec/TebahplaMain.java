package thirdWeek.rec;

import java.util.Scanner;

public class TebahplaMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("영어 문자열을 입력해주세요.");
		String input = scanner.next();
		
		Tebahpla tebahpla = new Tebahpla(input);
		
		tebahpla.show();
		
		scanner.close();
	}
}