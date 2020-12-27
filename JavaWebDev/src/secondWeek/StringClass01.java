package secondWeek;

public class StringClass01 {

	public static void main(String[] args) {
		String str1 = "happy";
		String str2 = "Birthday";
		System.out.println(str1 + " " + str2);
		
		printString(str1);
		printString(str2);
	}

	private static void printString(String str) {
		System.out.println(str);
	}
}