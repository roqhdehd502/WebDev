package secondWeek.rec;

import java.util.Random;
import java.util.Scanner;

public class UADMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int com = random.nextInt(50) + 1; // 컴퓨터가 숫자 선정
		int cnt = 0; // 기회 카운트
		
		while (cnt < 10) { // 10번 기회내에 숫자를 맞추지 못하면 게임종료.
			System.out.print("1부터 50까지의 숫자를 입력해주세요: ");
			int user = scanner.nextInt();
			
			UAD uad = new UAD(user, com);
			uad.setUser(user);
			uad.setCom(com);
			
			if (uad.getResult() == 0) { // 정답 체크
				System.out.println("정답입니다!");
				break;
			} else if (uad.getResult() == 1) {
				System.out.println("틀렸습니다. UP!");
				cnt ++;
				continue;
			} else if (uad.getResult() == 2) {
				System.out.println("틀렸습니다. DOWN!");
				cnt ++;
				continue;
			}
		}
		scanner.close();
		
		System.out.println();
		System.out.println("GAME OVER!");
	}
}