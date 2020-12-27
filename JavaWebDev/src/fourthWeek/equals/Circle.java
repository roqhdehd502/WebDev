package fourthWeek.equals;

public class Circle {
	private int x, y, rad;

	public Circle(int x, int y, int rad) {
		this.x = x;
		this.y = y;
		this.rad = rad;
	}
	
	@Override
	public String toString() {
		
		return "Circle(" + x + ", " + y + ") 반지름 " + rad;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ((this.x == ((Circle)obj).x)
				&& (this.y == ((Circle)obj).y)) {
			return true;
		} else {
			return false;
		}
	}
}