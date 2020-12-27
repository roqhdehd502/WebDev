package fourthWeek.rec.compare;

public class Rectangle {
	private int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
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
	
	private int getArea() {
		return width * height;
	}

	public static Rectangle compareRect(Rectangle r1, Rectangle r2) {
		if (r1.getArea() > r2.getArea()) {
			return r1;
		} else if (r1.getArea() < r2.getArea()) {
			return r2;
		} else { // 둘이 비슷하면 r1꺼 그냥 가져오기
			return r1;
		}
	}
}