package secondWeek.rec;

public class Calculator {
	private int num1, num2;
	private String sign;

	public Calculator(int num1, int num2, String sign) {
		this.num1 = num1;
		this.num2 = num2;
		this.sign = sign;
	}

	public int getNum1() {
		return num1;
	}

	public boolean setNum1(int num1) { // 유효성 검사.1
		this.num1 = num1;
		
		Integer wnum1 = new Integer(num1); // int -> Integer로 박싱하여 객체 비교
		
		if (!(wnum1 instanceof Integer)) {
			System.out.println("올바르지 않은 숫자 값 입니다. 다시 입력해주세요.");
			return false;
		} else {
			return true;
		}
	}

	public int getNum2() {
		return num2;
	}

	public boolean setNum2(int num2) { // 유효성 검사.2
		this.num2 = num2;
		
		Integer wnum2 = new Integer(num2);
		
		if (!(wnum2 instanceof Integer)) {
			System.out.println("올바르지 않은 숫자 값 입니다. 다시 입력해주세요.");
			return false;
		} else {
			return true;
		}
	}

	public String getSign() {
		return sign;
	}

	public boolean setSign(String sign) { // 유효성 검사.3
		this.sign = sign;
		
		if (!(sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/"))) {
			System.out.println("올바르지 않은 연산 기호 입니다. 다시 입력해주세요.");
			return false;
		} else {
			return true;
		}
	}

	public void show() {
		if (sign.equals("+")) {
			System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 + num2));
		} else if (sign.equals("-")) {
			System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 - num2));
		} else if (sign.equals("*")) {
			System.out.println(num1 + " " + sign + " " + num2 + " = " + (num1 * num2));
		} else if (sign.equals("/")) {
			System.out.println(num1 + " " + sign + " " + num2 + " = " + (double)(num1 / num2));
		}
	}
}