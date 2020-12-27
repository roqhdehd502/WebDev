package secondWeek.rec;

public class Circle {
	private int rad; // alt+shift+s로 getter/setter 설정가능

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public double getArea() {
		return Math.PI * Math.pow(rad, 2);
	}
}