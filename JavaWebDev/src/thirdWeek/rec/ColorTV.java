package thirdWeek.rec;

public class ColorTV extends TV { // 자식 클래스
	private int colors;
	
	public ColorTV () {
	}
	
	public ColorTV (int size, int colors) {
		super(size); // 부모 클래스의 생성자 메소드를 super 메소드로 호출
		this.colors = colors;
	}
	
	public int getColor() {
		return colors;
	}
}