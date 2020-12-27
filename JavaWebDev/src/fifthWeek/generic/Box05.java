package fifthWeek.generic;

public class Box05<T> implements Getable<T> {
	private T ob;
	
	@Override
	public T get() {
		return ob;
	}
	
	public void set(T o) {
		ob = o;
	}
}