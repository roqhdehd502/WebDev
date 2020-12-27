package fifthWeek.generic;

public class DBox<L, R> {
	private L left;
	private R right;
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + " 7 " + right;
	}
}
