package fifthWeek.rec;

public class CombinationBox {

	public static void main(String[] args) {
		Box02<Integer> box1 = new Box02<>();
		Box02<Integer> box2 = new Box02<>();
		
	    box1.set(99);
	    box2.set(55);
	    System.out.println(box1.get() + " & " + box2.get());
	    
	    swapBox(box1, box2);
	    System.out.println(box1.get() + " & " + box2.get());
	}

	private static <T extends Number> void swapBox(Box02<T> box1, Box02<T> box2) {
		T temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);
	}
}