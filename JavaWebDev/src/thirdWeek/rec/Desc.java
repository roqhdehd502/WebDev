package thirdWeek.rec;

import java.util.Arrays;
import java.util.Random;

public class Desc {
	private int[] num = new int[5];

	public Desc() {

	}

	public Desc(int[] num) {
		this.num = num;
	}

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}

	private int[] rndNum() {
		Random random = new Random();

		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(2147483647) + 1;
		}

		Arrays.sort(num); // 배열의 요소를 오름차순 정렬

		return num;
	}
	
	public void user() {
		rndNum();
		
		for (int i = (num.length-1); i >= 0 ; i--) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
