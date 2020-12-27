package fourthWeek;

public class ObjectEqualsMain02 {

	public static void main(String[] args) {
		String str1 = new String("So Simple");
		String str2 = new String("So Simple");
		
		// 참조 대상을 비교하는 if ~ else문
		System.out.println("Case. 1");
		if (str1 == str2) {
			System.out.println("str1, str2 참조 대상 동일하다.");
		} else {
			System.out.println("str1, str2 참조 대상 다르다.");
		}
		
		// 두 인스턴스 내용 비교하는 if ~ else문
		System.out.println("Case. 2");
		// 메소드 오버라이딩이 적용되었기 때문에 한 가지 주소만 가리켜 인스턴스 내용 동일
		if (str1.equals(str2)) {
			System.out.println("str1, str2 내용 동일하다.");
		} else {
			System.out.println("str1, str2 내용 다르다.");
		}

	}

}
