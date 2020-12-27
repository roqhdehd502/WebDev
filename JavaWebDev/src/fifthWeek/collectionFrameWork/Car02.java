package fifthWeek.collectionFrameWork;

public class Car02 implements Comparable<Car02> {
	private int disp; // 배기량

	public Car02(int d) {
		disp = d;
	}

	@Override
	public String toString() { 
		return "cc: " + disp; 
	}
	@Override
	public int compareTo(Car02 o) { 
		return disp - o.disp; 
	}

}
