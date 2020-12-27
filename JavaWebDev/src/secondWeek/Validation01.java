package secondWeek;

public class Validation01 {

	public static void main(String[] args) {
		divide(4, 2);
		divide(6, 2);
		divide(8, 0);
	}

	private static void divide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("유효하지 않은 값 입니다. 다시 입력해주십시오.");
			return ;
		} else {
			System.out.println((double)num1 / num2);
		}
	}
}
