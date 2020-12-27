package secondWeek.rec;

import java.util.Scanner;

public class ChargeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("환전을 하기 위해 돈을 넣어주세요.");
			int money = scanner.nextInt();
			System.out.println();
			
			Charge charge = new Charge(money);
			charge.getResult();
			System.out.println();
			System.out.println("다시 시작하시겠습니까? [Y / N]");
			
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
				System.out.println("올바르지 않은 입력 값 입니다. 처음부터 다시 시작합니다.");
				System.out.println();
				continue;
			}
		}
		scanner.close();
	}
}