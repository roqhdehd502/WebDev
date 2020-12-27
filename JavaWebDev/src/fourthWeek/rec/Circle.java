package fourthWeek.rec;

public class Circle extends Shape {
	double r; // 반지름
	
	public Circle(double r) {
		this.r = r;
	}
	
	
	@Override
	double calcArea() {
		return Math.PI * Math.pow(r, 2);
	}	
}