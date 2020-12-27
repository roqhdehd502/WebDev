package thirdWeek.rec;

public class TV { // 부모 클래스
	private int size; // 부모 클래스의 필드 변수에 private 사용
	
	public TV () {
	}
	
	public TV (int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
}