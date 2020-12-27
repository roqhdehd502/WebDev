package fifthWeek.collectionFrameWork;

public class ECar extends Car03 {
	private int battery;

	public ECar(int d, int b) {
		super(d);
		battery = b;
	}

	@Override
	public String toString() { 
		return "cc: " + disp + ", ba: " + battery; 
	}
}