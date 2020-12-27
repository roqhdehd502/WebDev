package thirdWeek.rec;

public class Point3D extends Point {
	public Point3D(int x, int y, int z) {
		super(x, y, z);
	}
	
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + + getZ() + ")" + "의 점";
	}
}