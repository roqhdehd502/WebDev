package fourthWeek.rec;

public class Exercise7_23 {

	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합 : " + sumArea(arr));
	}
	
	// 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환
	private static double sumArea(Shape[] arr) {
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}
}