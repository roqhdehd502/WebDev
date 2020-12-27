package secondWeek;

public class Method06 {

	public static void main(String[] args) { // 원과 사각형 넓이 구하기
		//System.out.println(Math.round(cirArea(11.5))); // Math.round(): 반올림
		System.out.println(square(20, 40));
		System.out.println(square(20.5, 40.7));
	}

	private static int square(int width, int height) {
		return width * height;
	}
	
	private static double square(double width, double height) { // 메소드 오버로딩을 하여 입력값의 타입이 다를 경우를 대비한다.
		return width * height;
	}
	/*
	private static double cirArea(double rad) {
		return Math.PI * Math.pow(rad, 2); // Math.PI: 상수 파이(3.14), Math.pow(): 거듭 제곱(반지름, 지수)
	}
	*/
}
