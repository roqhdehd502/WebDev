package secondWeek;

import java.util.Scanner;

public class HiddenInfo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요.: ");
		int rad = scanner.nextInt();
		System.out.println("원의 넓이: " + cicArea(rad)); // 리턴하여 나온 값을 사용자는 볼 수 있지만 해당 계산 식은 볼 수 없다.
		
		scanner.close();
	}

	private static double cicArea(int rad) { // private 접근제한자 지정으로 계산식의 접근을 방지한다.(다른 클래스 간 참조불가!)
		return Math.PI * Math.pow(rad, 2);
	}

}
