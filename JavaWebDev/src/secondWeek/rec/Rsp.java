package secondWeek.rec;

import java.util.Random;

public class Rsp {
	private String input;
	
	public Rsp(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public void output() {
		Random random = new Random();
		
		int out = random.nextInt(3) + 1; // 1==주먹, 2==가위, 3==보
		switch (out) {
		case 1: // 주먹
			if (input.equals("주먹")) {
				System.out.println("컴퓨터가 주먹을 냈으므로 비겼습니다!");
			} else if (input.equals("가위")) {
				System.out.println("컴퓨터가 주먹을 냈으므로 졌습니다!");
			} else {
				System.out.println("컴퓨터가 주먹을 냈으므로 이겼습니다!");
			}
			break;

		case 2: // 가위
			if (input.equals("주먹")) {
				System.out.println("컴퓨터가 가위를 냈으므로 이겼습니다!");
			} else if (input.equals("가위")) {
				System.out.println("컴퓨터가 가위를 냈으므로 비겼습니다!");
			} else {
				System.out.println("컴퓨터가 가위를 냈으므로 졌습니다!");
			}
			
			break;
			
		case 3: // 보
			if (input.equals("주먹")) {
				System.out.println("컴퓨터가 보를 냈으므로 졌습니다!");
			} else if (input.equals("가위")) {
				System.out.println("컴퓨터가 보를 냈으므로 이겼습니다!");
			} else {
				System.out.println("컴퓨터가 보를 냈으므로 비겼습니다!");
			}
			break;
		}
	}
}