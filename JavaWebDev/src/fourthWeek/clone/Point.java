package fourthWeek.clone;

public class Point implements Cloneable {
	private int xPos;
	private int yPos;

	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}

	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}