package secondWeek.rec;

public class Rectangle {
	
	private int x, y, width, height;
	
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y= y;
    }
    
    public void setWidth(int width) {
        this.width= width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
	
	public int square() { 
		return width*height;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")에서 크기가 " + width + " X "+ height + "인 사각형");
	}
	
	private double eucDis(Rectangle r) { // 유클리드 거리
		return Math.sqrt(Math.pow(Math.abs(r.x-x), 2) + Math.pow(Math.abs(r.y-y), 2));
	}

	public boolean contains(Rectangle r) { // 판별식을 통해 true 혹은 false로 리턴 값 도출
		if ((eucDis(r) <= height) && (eucDis(r) <= width)) {
			return true;
		} else if (eucDis(r) <= (Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2)))) {
			return true;
		} else {
			return false;
		}
	}
}