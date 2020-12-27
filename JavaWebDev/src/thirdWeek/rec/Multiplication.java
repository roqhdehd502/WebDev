package thirdWeek.rec;

import java.util.Random;

public class Multiplication {
	private int[] num = new int[10];
	
	public Multiplication() {

	}
	
	public Multiplication(int[] num) {
		this.num = num;
	}

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}
	
	public int[] rndNum() {
		Random random = new Random();
		
		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(2147483647) + 1; // 양의 정수 랜덤 생성하여 배열에 담기
		}
		
		return num;
	}
	
	public void getThree() {
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0) { // 3의 나머지가 0인것 == 3의 배수
				System.out.print(num[i] + " ");
			}
		}
		System.out.println();
	}
	
	public void user() {
		rndNum();
		getThree();
	}
}