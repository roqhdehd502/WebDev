package fourthWeek.rec;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TimerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Timer player1 = new Timer();
		Timer player2 = new Timer();
		
		System.out.println("입력한 두 시간의 차이가 10초에 가까운 사람이 이기는 게임입니다.");
		
		try {
			int result1 = player1.game();
			int result2 = player2.game();
			
			if(Math.abs(result1 - 10) < Math.abs(result2 - 10))
				System.out.println("1p님의 결과: "+result1+", 2p님의 결과 "+result2+", 승자는 1p");
			else
				System.out.println("1p님의 결과: "+result1+", 2p님의 결과 "+result2+", 승자는 2p");
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	
		scanner.close();
	}
}