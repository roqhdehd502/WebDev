package firstWeek;

public class UseVariable {

	public static void main(String[] args) {
		int num1; // 데이터 타입이 int인 변수 num1 선언(메모리 공간 할당)
		num1 = 10; // 선언된 num1에 10이라는 값을 초기화
		
		int num2 = 20; // 변수의 선언과 초기화를 동시에 하는 것도 가능
		int num3 = num1 + num2; // 두 변수의 조합으로 새로운 변수를 선언 및 초기화
		System.out.println(num1 + " + " + num2 + " = " + num3); // 초기화된 변수들의 값을 출력
		
	}

}
