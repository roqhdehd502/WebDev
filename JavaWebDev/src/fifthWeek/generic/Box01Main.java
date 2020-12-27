package fifthWeek.generic;

public class Box01Main {

	public static void main(String[] args) {
		Box01<String> sBox = new Box01<>();
		sBox.set("I am so happy.");
		
		Box01<Box01<String>> wBox = new Box01<>();
		wBox.set(sBox);
		
		Box01<Box01<Box01<String>>> zBox = new Box01<>();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
	}

}
