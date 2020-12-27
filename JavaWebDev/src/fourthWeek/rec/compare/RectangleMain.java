package fourthWeek.rec.compare;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5,6);
		Rectangle r2 = new Rectangle(7,9);

		Rectangle r3 = Rectangle.compareRect(r1,r2);

		System.out.println(r3.getWidth() + " : " +  r3.getHeight() + "입니다.");
	}
}