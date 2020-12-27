package fourthWeek.rec;

public class MyPoint {
	private int x, y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if ((this.x == ((MyPoint)obj).x)
				&& (this.y == ((MyPoint)obj).y)) {
			return true;
		} else {
			return false;
		}
	}
}