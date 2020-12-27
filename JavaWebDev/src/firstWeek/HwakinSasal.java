package firstWeek;

public class HwakinSasal {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		boolean result;
		
		result = (((a += 10) < 0) && ((b += 10) > 0));
		System.out.println("a: " + a + " b: " + b);
		
		result = (((a += 10) > 0) || ((b += 10) > 0));
		System.out.println("a: " + a + " b: " + b);
	}
}