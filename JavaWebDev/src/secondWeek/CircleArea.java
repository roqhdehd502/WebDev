package secondWeek;

public class CircleArea {

	public static void main(String[] args) {
		int rad = 5;
		System.out.println("반지름 " + rad + "인 원의 넓이는 " + Math.round(getCircleArea(rad)) + " 입니다.");
	}

	private static double getCircleArea(int rad) {
		return Math.PI * Math.pow(rad, 2);
	}
}