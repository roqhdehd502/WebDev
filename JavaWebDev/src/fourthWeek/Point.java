package fourthWeek;

public class Point implements Cloneable {
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
