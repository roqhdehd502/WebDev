package firstWeek;

public class ForMoon {

	public static void main(String[] args) {
		int num1 = 0;
		while (num1 < 5) { // 루프 자체를 더 집중한다.
			System.out.println("I am " + num1);
			num1 ++;
		}
		
		int num2 = 0;
		do { // 행위 자체를 더 집중한다.(최소 한 번은 실행)
			System.out.println("I like Java " + num2);
			num2++;
		} while (num2 < 5);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("I like Java " + i);
		}
		/*
		 * int i, i < 5, sout, i++
		 * i < 5, sout, i++
		 * 2가 i == 5 이므로 탈출
		 */
	}
}