package fourthWeek;

public class ExceptionMessage {
	public static void md1(int n) {
		md2(n, 0);
	}
	
	public static void md2(int n1, int n2) {
		int r = n1 / n2;
	}

	public static void main(String[] args) {
		try {
			md1(3); // 이 지점에서 md1으로 부터 예외가 넘어온다
		} catch (Throwable e) {
			e.printStackTrace(); // 해당 메소드로 에러 발생 내역 출력
		}
		System.out.println("Good Bye");
	}
}