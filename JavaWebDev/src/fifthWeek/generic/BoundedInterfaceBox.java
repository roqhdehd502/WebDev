package fifthWeek.generic;

public class BoundedInterfaceBox {

	public static void main(String[] args) {
		Box02<Apple> box = new Box02<>();
        box.set(new Apple());
        
        Apple ap = box.get();
        System.out.println(ap);
	}
}