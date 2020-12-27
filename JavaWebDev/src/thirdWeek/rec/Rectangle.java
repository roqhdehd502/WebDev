package thirdWeek.rec;

public class Rectangle extends Shape {
	public Rectangle (int width, int height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {
		return getHeight() * getWidth();
	}
}