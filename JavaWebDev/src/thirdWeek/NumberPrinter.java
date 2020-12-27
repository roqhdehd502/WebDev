package thirdWeek;

public class NumberPrinter {
	private int myNum = 0;

	public static void showInt(int n) {
		System.out.println(n);
		
	}

	public static void showDouble(double n) {
		System.out.println(n);
		
	}

	public void setMyNumber(int n) {
		myNum = n;
		
	}

	public void showMynumber() {
		showInt(myNum); // 내부 접근
		
	}
}