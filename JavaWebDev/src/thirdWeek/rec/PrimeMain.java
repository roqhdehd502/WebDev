package thirdWeek.rec;

import java.util.Random;

public class PrimeMain {

	public static void main(String[] args) {
		Random random = new Random();
		
		int rnum = random.nextInt(100) + 2; // 2 ~ 100 난수 생성
		
		Prime prime = new Prime(rnum);
		
		prime.show();
	}
}