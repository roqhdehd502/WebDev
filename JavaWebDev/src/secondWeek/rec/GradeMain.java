package secondWeek.rec;

import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("국어, 영어, 수학 점수를 입력하십시오.");
			System.out.println();
			
			System.out.print("국어: ");
			int kor = scanner.nextInt();
			System.out.print("영어: ");
			int eng = scanner.nextInt();
			System.out.print("수학: ");
			int mat = scanner.nextInt();
			System.out.println();
			
			Grade grade = new Grade(kor, eng, mat);
			System.out.println(grade.getGrade() + " 입니다.");
			System.out.println("계속하시겠습니까? [Y / N]");
			char con = scanner.next().charAt(0); 
			
			if ((con == 'Y') || (con == 'y')) {
				System.out.println();
				System.out.println("프로그램을 다시 시작합니다.");
				System.out.println();
				continue;
			} else if ((con == 'N') || (con == 'n')) {
				System.out.println();
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println();
				System.out.println("올바르지 않은 입력값입니다. 다시 시작합니다.");
				System.out.println();
				continue;
			}
		}
		scanner.close();
	}
}