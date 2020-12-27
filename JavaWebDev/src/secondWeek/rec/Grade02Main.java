package secondWeek.rec;

import java.util.Scanner;

public class Grade02Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("국어 성적 입력: ");
			int kor = scanner.nextInt();
			System.out.print("영어 성적 입력: ");
			int eng = scanner.nextInt();
			System.out.print("수학 성적 입력: ");
			int mat = scanner.nextInt();
			
			Grade02 grade = new Grade02(kor, eng, mat);
			grade.show();
			
			System.out.println("프로그램을 다시 시작하시겠습니까? [Y / N]");
			char con = scanner.next().charAt(0);
			
			if (con == 'Y' || con == 'y') {
				System.out.println("프로그램을 다시 시작합니다.");
				continue;
			} else if (con == 'N' || con == 'n') {
				System.out.println("프로그램을 종료 합니다.");
				break;
			} else {
				System.out.println("잘못된 입력 값 입니다. 다시 시작합니다.");
				continue;
			}
		}
		
		scanner.close();
	}
}