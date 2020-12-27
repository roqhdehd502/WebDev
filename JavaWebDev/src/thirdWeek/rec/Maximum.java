package thirdWeek.rec;

import java.util.Arrays;
import java.util.Random;

public class Maximum {
	private int[] num = new int[5];
	
	public Maximum() {
		
	}

	public Maximum(int[] num) {
		this.num = num;
	}

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}
	
	private int[] maxNum() {
		Random random = new Random();
		
		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(2147483647) + 1;
		}
		
		Arrays.sort(num); // 배열의 요소를 오름차순 정렬
		
		return num;
	}

	public void user() {
		maxNum();
		System.out.println("최대값은 " + num[4] + " 입니다.");
	}
}