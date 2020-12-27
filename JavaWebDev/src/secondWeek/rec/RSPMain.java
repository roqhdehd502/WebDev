package secondWeek.rec;

import java.util.Scanner;

public class RSPMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		outerloop:
		while (true) {
			System.out.print("가위바위보를 입력하세요. [가위 / 바위 / 보]: ");
			String input = scanner.next();
			
			// 입력 값 유효성 검사.1
			if (!(input.equals("가위") || input.equals("바위") || input.equals("보"))) {
				System.out.println("올바르지 않은 입력 값 입니다. 다시 입력해주세요.");
				continue;
			}
			
			Rsp rsp = new Rsp(input); // 결과 출력
			rsp.output();
			
			// 입력 값 유효성 검사.2
			innerloop:
			while (true) {
				System.out.println();
				System.out.print("다시 시작하시겠습니까? [Y / N]: ");
				char con = scanner.next().charAt(0);
				
				if (con == 'Y' || con == 'y') {
					System.out.println();
					System.out.println("프로그램을 다시 시작합니다.");
					System.out.println();
					break innerloop; // innerloop를 탈출하여 게임을 다시 시작
				} else if (con == 'N' || con == 'n') {
					System.out.println();
					System.out.println("프로그램을 종료합니다.");
					break outerloop; // outerloop를 탈출하여 게임을 종료
				} else {
					System.out.println("올바르지 않은 입력 값 입니다. 다시 입력해주세요.");
					continue; // innerloop 반복
				}
			}
		}
		scanner.close();
	}
}