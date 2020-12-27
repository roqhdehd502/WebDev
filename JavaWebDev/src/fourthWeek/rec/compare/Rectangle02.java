package fourthWeek.rec.compare;

import java.util.Arrays;
import java.util.Collections;

public class Rectangle02 implements Comparable<Rectangle02> {
	private int width, height;
	
	public Rectangle02() {
		
	}
	
	public Rectangle02(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() { 
		return width * height;
	}
	
	@Override
	public int compareTo(Rectangle02 rec) {
		if (this.getArea() < rec.getArea()) {
			return -1;
		} else if (this.getArea() == rec.getArea()) {
			return 0;
		} else {
			return 1;
		}
	}

	public static Rectangle02[] getSortingRec(Rectangle02[] rec) {
		Arrays.sort(rec, Collections.reverseOrder()); // 컬렉션으로 내림차순 정렬하기
		return rec;
	}
}