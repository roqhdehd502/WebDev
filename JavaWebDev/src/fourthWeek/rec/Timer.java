package fourthWeek.rec;

import java.util.Scanner;
import java.util.Calendar;

public class Timer {
	Scanner scanner = new Scanner(System.in);
	Calendar calendar = Calendar.getInstance();
	
	private int sec1, sec2;
	private String temp;
	
	private int showTime() {
		temp = scanner.nextLine();
		calendar = Calendar.getInstance();
		System.out.println("현재 초 시간 = " + calendar.get(Calendar.SECOND));
		return calendar.get(Calendar.SECOND);
	}
	
	public int game() {
		System.out.println("시작 키  >>");
		sec1 = showTime();
		System.out.println("10초정도 예상하신 후 다시 입력해주세요.");
		sec2 = showTime();
		
		if (sec1 < sec2) {
			return sec2 - sec1;
		} else {
			return sec2 + (60 - sec1);
		}
	}
}