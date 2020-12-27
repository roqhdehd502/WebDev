package fourthWeek;

public class ObjectEqualsMain {
	public static void main(String[] args) {
		INum num1 = new INum(10);
		INum num2 = new INum(12);
		INum num3 = new INum(10);
		
		System.out.println("Case. 1");
		if (num1.equals(num2)) {
			System.out.println("num1, num2 내용 동일하다.");
		} else {
			System.out.println("num1, num2 서로 다르네요.");
		}
		
		// 각각 새로 생성된 인스턴스와의 비교이기 때문에 값이 같아도 서로 다르다
		System.out.println("Case. 2");
		if (num1.equals(num3)) { 
			System.out.println("num1, num3 내용 동일하다.");
		} else {
			System.out.println("num1, num3 서로 다르네요.");
		}
	}
}
