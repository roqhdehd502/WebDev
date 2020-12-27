package fifthWeek.generic;

public class GenericInterfaceMain {

	public static void main(String[] args) {
		Box05<Toy02> box = new Box05<>();
		box.set(new Toy02());
		
		// Box<T>가 Getable<T>를 구현하므로 참조 가능
		Getable<Toy02> gt = box;
		System.out.println(gt.get());
	}
}