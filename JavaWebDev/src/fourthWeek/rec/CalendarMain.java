package fourthWeek.rec;

import java.util.Calendar;

public class CalendarMain {
	static Calendar calendar = Calendar.getInstance();
	
	public static void main(String[] args) {
		int year = calendar.get(Calendar.YEAR);
		int mon = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int dowim = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH); // 달에서 요일의 횟수 반환
		
		int wom = calendar.get(Calendar.WEEK_OF_MONTH); // 월의 주 횟수를 반환
		int doy = calendar.get(Calendar.DAY_OF_YEAR); // 해의 날짜를 반환
		int woy = calendar.get(Calendar.WEEK_OF_YEAR); // 해의 주 횟수를 반환
		
		System.out.println("오늘은 " + year + "년 "+ (mon+1) + "월 " + day + "일 " + getDOW() +"요일입니다.");
		System.out.println("이 달의 " + dowim + "번째 " + getDOW() +"요일입니다.");
		System.out.println("이 달의 " + wom + "번째 주입니다.");
		System.out.println("이 해의 " + doy + "일 입니다.");
		System.out.println("이 해의 " + woy + "번째 주입니다.");
	}
	
	private static char getDOW() {
		char result = 0;
		int dow = calendar.get(Calendar.DAY_OF_WEEK); // 요일을 반환, 1이 일요일
		
		switch (dow) {
		case 1:
			result = '일';
			break;
		case 2:
			result = '월';
			break;
		case 3:
			result = '화';
			break;
		case 4:
			result = '수';
			break;
		case 5:
			result = '목';
			break;
		case 6:
			result = '금';
			break;
		case 7:
			result = '토';
			break;
		}
		
		return result;
	}
}