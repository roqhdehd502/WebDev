package thirdWeek.rec;

public class Shape {
	private int rad, width, height;
	
	public Shape (int rad) {
		this.rad = rad;
	}
	
	public Shape (int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getArea() {
		return 0.0;
	}
}