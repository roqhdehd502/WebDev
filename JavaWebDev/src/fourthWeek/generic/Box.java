package fourthWeek.generic;

public class Box<T> {
	private T ob;

	public void set(T o) {
        ob = o;
    }
	
    public T get() {
        return ob;
    }
}