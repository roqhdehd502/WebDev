package fourthWeek.rec;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircularQueue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어와 한글 모두 됩니다.");
		
		try { // 입력값 유효성 검사
			String inStr = scanner.nextLine(); // 문자열 입력
			String[] str = inStr.split(""); // inStr을 split(문자 단위)하여 문자열 객체 선언
			
			for (int i = 0; i < str.length; i++) {
				inStr = inStr.substring(1) + inStr.substring(0, 1);
				System.out.println(inStr);
			}

		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력값 입니다! 다시 입력해주세요.");
		}
		
		scanner.close();
	}
}