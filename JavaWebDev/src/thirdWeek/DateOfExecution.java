package thirdWeek;

import java.time.LocalDate;

public class DateOfExecution {
	static String date;
	
	static { // 인스턴스 생성과 관계 없이 static 변수가 메모리 공간에 할당될 때 실행이 된다.
		LocalDate nDate = LocalDate.now();
		date = nDate.toString();
	}

	public static void main(String[] args) {
		System.out.println(date);

	}
}