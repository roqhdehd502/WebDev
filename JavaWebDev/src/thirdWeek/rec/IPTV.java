package thirdWeek.rec;

public class IPTV extends ColorTV { // 손주 클래스
	private String address;
	
	public IPTV () {
	}
	
	public IPTV (String address, int size, int colors) {
		super(size, colors);
		this.address = address;
	}
	
	public void printProperty() {
		System.out.print(address + "주소에 " + getSize() + "인치 " + getColor() + "해상도");
	}
}