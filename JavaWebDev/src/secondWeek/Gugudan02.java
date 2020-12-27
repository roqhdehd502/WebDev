package secondWeek;

public class Gugudan02 {

	public static void main(String[] args) {
		System.out.println("구구단 2단부터 9단까지 모두 출력합니다.");
		for (int i = 2; i <= 9; i++) { // 구구단 2단부터 9단까지 모두 출력하기
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("구구단 2단부터 9단까지 짝수단만 출력합니다.");
		for (int i = 2; i <= 9; i+=2) { // 구구단 2단부터 9단까지 짝수단만 출력하기
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("구구단 2단부터 9단까지 결과값이 홀수인것만 출력합니다.");
		for (int i = 2; i <= 9; i++) { // 구구단 2단부터 9단까지 결과값이 홀수인것만 출력하기
			for (int j = 1; j <= 9; j++) {
				if (((i * j) % 2) != 1) {
					continue;
				} else {
					System.out.print(i + " * " + j + " = " + (i * j) + "\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("구구단 2단부터 9단까지 결과값이 3의 배수인것만 출력합니다.");
		for (int i = 2; i <= 9; i++) { // 구구단 2단부터 9단까지 결과값이 3의 배수인것만 출력하기
			for (int j = 1; j <= 9; j++) {
				if (((i * j) % 3) != 0) {
					continue;
				} else {
					System.out.print(i + " * " + j + " = " + (i * j) + "\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("구구단 2단부터 9단까지 결과값이 2의 배수이자, 3의 배수인것만 출력합니다.");
		for (int i = 2; i <= 9; i++) { // 구구단 2단부터 9단까지 결과값이 2의 배수이자, 3의 배수인것만 출력하기
			for (int j = 1; j <= 9; j++) {
				if ((((i * j) % 2) == 0) && (((i * j) % 3) == 0)) {
					System.out.print(i + " * " + j + " = " + (i * j) + "\t");
				} else {
					continue;
				}
			}
			System.out.println();
		}
		System.out.println();
		int cnt = 0;
		System.out.println("구구단 2단부터 9단까지 결과값이 2의 배수인 갯수를 출력합니다.");
		for (int i = 2; i <= 9; i++) { // 구구단 2단부터 9단까지 결과값이 2의 배수인 갯수를 출력하기
			for (int j = 1; j <= 9; j++) {
				if (((i * j) % 2) == 0) {
					cnt ++;
				} else {
					continue;
				}
			}
		}
		System.out.print("갯수는 " + cnt + "개 입니다.");
	}
}