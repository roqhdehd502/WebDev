package thirdWeek.rec;

import java.util.Random;
import java.util.Scanner;

public class Gambling {
	private int i,j;
	private final int NUM = 2;

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	Person[] person = new Person[NUM]; // 선수
	Person[][] card = new Person[NUM][3]; // 카드

	private void inputPlayer() {
		for (i = 0; i < person.length; i++) { // 선수 이름 입력
			System.out.print((i+1) + "번째 선수 이름>>");
			String user = scanner.nextLine();
			person[i] = new Player(user);
		}
	}

	public void getGame () {
		inputPlayer();

		loop:
		while (true) {
			for (i = 0; i < card.length; i++) { // 카드 패 돌리기
				for (j = 0; j < card[i].length; j++) {
					int cdnum = random.nextInt(3) + 1;
					card[i][j] = new CardNum(cdnum);
				}
			}

			for (i = 0; i < card.length; i++) {
				System.out.print("[" + person[i].getUser() + "]:");
				scanner.nextLine();

				for (j = 0; j < card[i].length; j++) {
					System.out.print(card[i][j].getCard() + " ");
				}

				if ((card[i][0].getCard() == card[i][1].getCard())
						&& (card[i][0].getCard() == card[i][2].getCard())) {
					System.out.println(person[i].getUser() + "님이 이겼습니다!");
					break loop;
				} else {
					System.out.println("아쉽군요!");
				}
			}
		}	
	}
}