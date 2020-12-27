package thirdWeek;

public class StringInstance {

	public static void main(String[] args) {
		String str1 = new String("Simple String");
		String str2 = "The Best String";
		
		System.out.println(str1); // 13
		System.out.println(str1.length()); // str1의 길이(크기)를 출력
		System.out.println();
		
		System.out.println(str2); // 15(띄어쓰기를 포함한다.)
		System.out.println(str2.length()); // str2의 길이(크기)를 출력
		System.out.println();
		
		showString("Funny String"); // 12
	}

	private static void showString(String str) {
		System.out.println(str);
		System.out.println(str.length()); // str의 길이(크기)를 출력
		
	}
}