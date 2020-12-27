package firstWeek;

public class IEIE {

	public static void main(String[] args) {
		int num1 = 80;
		int num2 = 80;
		int num3 = 60;

		int max = (num1 > num2) && (num1 > num3) 
				? num1 
				: (num2 > num3 ? num2 : num3);
		
		System.out.println(max);
	}
}