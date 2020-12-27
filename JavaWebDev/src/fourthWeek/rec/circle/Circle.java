package fourthWeek.rec.circle;

public class Circle implements Shape {
	private double rad;

	public Circle(double rad) {
		this.rad  = rad;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 " + rad + "인 원을 그렸습니다.");
	}

	@Override
	public double getArea() {
		return PI * Math.pow(rad, 2);
	}
}