package fifthWeek.rec;

public class DBox<T1, T2> {
	private T1 t1;
	private T2 t2;

	public void set(T1 t1, T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	@Override
	public String toString() {
		return t1 + " & " + t2;
	}
}