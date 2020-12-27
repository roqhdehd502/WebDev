package fifthWeek.rec;

public class DDBox<T1, T2> extends DBox<T1, T2> {
	private DBox<String, Integer> box1;
	private DBox<String, Integer> box2;
	
	public void set(DBox<String, Integer> box1, DBox<String, Integer> box2) {
		this.box1 = box1;
		this.box2 = box2;
	}
	
	@Override
	public String toString() {
		return box1 + "\n" + box2;
	}
}