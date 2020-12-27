package fourthWeek.rec.exam;

public class Circle {
	private double rad;
	
	public Circle(double rad) {
		this.rad = rad;
	}
	
	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}
	
	public double getArea() { // 원의 넓이
		return Math.PI * Math.pow(rad, 2);
	}

	@Override
	public String toString() {
		return "출력: 넓이는 " + getArea() + " 입니다.";
	}
}