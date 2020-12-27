package thirdWeek;

public class ImmutableString {

	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		if (str1 == str2) { // 인스턴스 비교
			System.out.println("str1과 str2는 동일 인스턴스 참조"); // Immutable 클래스인 String으로 인해 중복이 최소화되어 주소가 같다.
		} else {
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		}
		
		if (str3 == str4) { // 인스턴스 비교
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		} else {
			System.out.println("str1과 str2는 다른 인스턴스 참조"); // 서로 다른 객체를 생성하여 인스턴스의 주소가 다르다.
		}
		
		if (str1.equals(str4)) { // 값 비교 
			System.out.println("str1과 str4는 같은 값을 참조"); // 객체가 아닌 값을 비교했기 때문에 서로 같다.
		} else {
			System.out.println("str1과 str4는 다른 값을 참조");
		}

	}

}
