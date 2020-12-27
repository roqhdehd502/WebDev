package thirdWeek.rec;

import java.util.Random;

public class AvgNum {
	private int[] num;
	private final int ROWS;

	public AvgNum() {
		ROWS = 10;
		num = new int[ROWS];
	}
	/*
	public AvgNum(int[] num) {
		this.num = num;
	}
	*/
	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}
	
	private void rndNum() {
		Random random = new Random();
		
		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(10) + 1;
		}
	}
	
	private double rndNumAvg() {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return (double)sum / num.length;
	}
	
	public void user() {
		rndNum();
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("평균은 " + rndNumAvg());
	}
}