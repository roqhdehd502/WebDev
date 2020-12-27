package fourthWeek.clone;

public class RectangleShallow implements Cloneable  {
	private Point upperLeft; // 좌측 상단 좌표
	private Point lowerRight; // 우측 하단 좌표

	public RectangleShallow(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}

	// 좌표 정보를 수정함
	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	// 얉은 복사의 형태로 해당 객체를 복사
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// 직사각형 좌표 정보 출력    
	public void showPosition() {
		System.out.print("좌측 상단: ");
		upperLeft.showPosition();

		System.out.print("우측 하단: ");
		lowerRight.showPosition();
		System.out.println(); 
	}
}