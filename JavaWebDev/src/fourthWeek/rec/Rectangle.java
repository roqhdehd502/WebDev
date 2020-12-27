package fourthWeek.rec;

public class Rectangle extends Shape {
	double width, height; // 폭과 높이

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() { // 정사각형인지 아닌지를 알려준다.
		boolean result = false;
		
		// 
		if (width == height) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
}