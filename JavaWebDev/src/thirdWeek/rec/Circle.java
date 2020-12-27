package thirdWeek.rec;

public class Circle extends Shape {
	
	public Circle (int rad) {
		super(rad);
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(getRad(), 2);
	}
}