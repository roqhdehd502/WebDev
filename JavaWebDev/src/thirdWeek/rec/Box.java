package thirdWeek.rec;

public class Box {
	private int num;
	private String value;
	
	public Box(int num, String value) {
		this.num = num;
		this.value = value;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString() {
		return this.num + " " + this.value;
	}
	
	public int getBoxNum() {
		return num;
	}
}