package thirdWeek;

public class Box {
	private int num;
	private String conts;
	
	public Box(String conts) {
		this.conts = conts;
	}
	
	public Box(int num, String conts) {
		this.num = num;
		this.conts = conts;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getConts() {
		return conts;
	}

	public void setConts(String conts) {
		this.conts = conts;
	}

	public String toString() {
		return conts; // 문자열 반환
	}

	public int getBoxNum() {
		toString();
		return 0;
	}
}
