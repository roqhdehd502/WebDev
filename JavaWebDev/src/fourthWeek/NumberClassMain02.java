package fourthWeek;

public class NumberClassMain02 {

	public static void main(String[] args) {
		Integer n1 = Integer.valueOf(5); // 숫자 기반 Integer 인스턴스 생성
		Integer n2 = Integer.valueOf("1024"); // 문자열 기반 Integer 인스턴스 생성
		
		// 대소 비교와 합을 계산하는 클래스 메소드
		System.out.println("큰 수: " + Integer.max(n1, n2));
		System.out.println("작은 수: " + Integer.min(n1, n2));
		System.out.println("합: " + Integer.sum(n1, n2));
		System.out.println();
		
		// 정수에 대한 2진, 8진, 16진수 표현 결과를 반환하는 클래스 메소드
		System.out.println("1024의 2진 표현: " + Integer.toBinaryString(n2));
		System.out.println("1024의 8진 표현: " + Integer.toOctalString(n2));
		System.out.println("1024의 16진 표현: " + Integer.toHexString(n2));
	}
}