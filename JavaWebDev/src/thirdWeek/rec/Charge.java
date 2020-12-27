package thirdWeek.rec;

import java.util.Scanner;

public class Charge {
	private int[] unit = {50000, 10000, 1000, 500, 
			100, 50, 10, 1}; // 환산할 돈의 종류
	private int money;

	public Charge() {

	}

	public Charge(int[] unit, int money) {
		this.unit = unit;
		this.money = money;
	}

	public int[] getUnit() {
		return unit;
	}

	public void setUnit(int[] unit) {
		this.unit = unit;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void inputMoney() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("금액을 입력하시오 >> ");
		money = scanner.nextInt();

		scanner.close();
	}

	public void exchange() {
		for (int i = 0; i < unit.length; i++) {
			int cnt = money / unit[i];
			System.out.println(unit[i] + " 원 짜리 : " + cnt + "개");
			
			money = money - cnt * unit[i];
		}
	}

	public void user() {
		inputMoney();
		exchange();
	}
}