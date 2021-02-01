package edu.bit.ex.bean;

public class Square {
	private int width;
	private int height;

	public Square() { }

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea(int width, int height) {
		return width * height;
	}
}
