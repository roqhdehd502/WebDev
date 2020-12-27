package thirdWeek.rec;

public class Point {
	private static int x, y, z;

	public Point(int x, int y, int z) {
		Point.x = x;
		Point.y = y;
		Point.z = z;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}
	
	public void moveUp() {
		Point.z = z + 1;
	}

	public void moveDown() {
		Point.z = z - 1;
	}

	public void move(int x, int y) {
		Point.x += x;
		Point.y += y;
	}
	
	public void move(int x, int y, int z) {
		Point.x += x;
		Point.y += y;
		Point.z += z;
	}
}