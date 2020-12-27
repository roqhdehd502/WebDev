package thirdWeek.rec;

public class ShapeMain {
	public static void main(String[] args) {
			Shape[] shape = new Shape[2];
		
			shape[0] = new Circle(5);
			shape[1] = new Rectangle(5, 10);
			
			for (int i = 0; i < shape.length; i++) {
				System.out.println("넓이: " + shape[i].getArea());
			}
			
			double area = 0;
			for (int i = 0; i < shape.length; i++) {
				area += shape[i].getArea(); // 다형성의 응용
			}
			System.out.println("두 넓이의 합: " + area);
			/*
			System.out.println(s1.getArea()); // 원의 넓이
			System.out.println(s2.getArea()); // 사각형의 넓이
			*/
	}
}