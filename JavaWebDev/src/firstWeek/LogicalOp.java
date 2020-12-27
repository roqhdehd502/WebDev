package firstWeek;

public class LogicalOp {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		result = (1 < num1) && (num1 < 100);
		System.out.println("num1은 1 초과 100 미만인가?: " + result);
		
		result = ((num2 % 2) == 0) || ((num2 % 2) == 0); 
		System.out.println("num2는 2 또는 3의 배수인가? " + result);
		
		result = !(num1 != 0); 
		System.out.println("num1은 0 인가? " + result);
	}

}
