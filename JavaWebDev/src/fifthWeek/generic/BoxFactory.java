package fifthWeek.generic;

public class BoxFactory {
	public static <T> Box03<T> makeBox(T o) {
		Box03<T> box = new Box03<T>();
		box.set(o);
		return box;
	}
}