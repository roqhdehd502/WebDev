package thirdWeek.rec;

import java.util.Scanner;

public class Reservation {
	private int num;
	static private int[] sit;
	
	public Reservation() {
		sit = new int[10];
	}
	
	public Reservation(int num, int[] sit) {
		this.num = num;
		Reservation.sit = sit;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int[] getSit() {
		return sit;
	}

	public void setSit(int[] sit) {
		Reservation.sit = sit;
	}
	
	public int getCinema() {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("몇 번째 좌석을 예약 하시겠습니까?: ");
		int num = scanner.nextInt();
		sit[num] = num;
		scanner.close();
		return sit[num];
	}

	public void show() {
		System.out.println("0 1 2 3 4 5 6 7 8 9 : 좌석 번호");
		System.out.println("-------------------");
		System.out.println();
		for (int i = 0; i < sit.length; i++) {
			System.out.print(sit[i] + " ");
		}
		System.out.println();
		
		getCinema();
		
		System.out.println();
		System.out.println("0 1 2 3 4 5 6 7 8 9 : 좌석 번호");
		System.out.println("-------------------");
		System.out.println();
		for (int i = 0; i < sit.length; i++) {
			if (sit[i] != 0) {
				System.out.print(1 + " ");
			} else {
				System.out.print(sit[i] + " ");
			}
		}
	}
}