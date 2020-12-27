package secondWeek;

public class Method03 {

	public static void main(String[] args) { // 덧셈과 제곱 
		int result = adder(4, 5);
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 * 3.5 = " + square(3.5));
	}

	private static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
	}

	private static double square(double num) {
		return num * num;
	}
}