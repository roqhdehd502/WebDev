package secondWeek;

public class Example01 {

	public static void main(String[] args) {
		/*
		// 인코딩 문제
		char ch = '가';
		System.out.println(ch + '\n');
		*/
		/*
		// 구구단 찍기
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
		*/
		/*
		// 성젹표 찍기
		int kor = 80;
		int eng = 80;
		int mat = 60;
		int sum = kor + eng + mat;
		double avg = (double)sum / 3;
		
		System.out.print("당신의 평균 점수는 " + Math.round(avg) + "점 이고, 등급은 ");
		if (avg >= 90) {
			System.out.println("수 입니다.");
		} else if (avg >= 80) {
			System.out.println("우 입니다.");
		} else if (avg >= 70) {
			System.out.println("미 입니다.");
		} else if (avg >= 60) {
			System.out.println("양 입니다.");
		} else {
			System.out.println("가 입니다.");
		}
		*/
		/*
		// n열로 별찍기
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		/*
		// 계단으로 별찍기
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*
		/*
		// 역 계단으로 별찍기
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		/*
		// 반전하여 계단으로 별찍기
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
	}
}