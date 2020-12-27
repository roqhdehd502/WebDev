package thirdWeek.rec.television;

import thirdWeek.SuperCLS;

public class ColorTV extends TV {
	private String color;

	public ColorTV (int size, String color) {
		super(size);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void infoTV() {
		System.out.println(getSize() + "인치 " + getColor() + "색상 TV");
	}
}