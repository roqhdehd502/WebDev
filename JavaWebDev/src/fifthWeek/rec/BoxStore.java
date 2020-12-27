package fifthWeek.rec;

public class BoxStore {

	public static void main(String[] args) {
		Box03<Integer> box1 = new Box03<>();
		box1.set(24);
		Box03<String> box2 = new Box03<>();
		box2.set("Poly");

		if(compBox(box1, 25))
			System.out.println("상자 안에 25 저장");

		if(compBox(box2, "Moly"))
			System.out.println("상자 안에 Moly 저장");

		System.out.println(box1.get());
		System.out.println(box2.get());
	}
	
	// 해당 메소드의 두 번째 매개변수는 제네릭 타입으로 지정할 수도 있다.
	private static boolean compBox(Box03<Integer> box, int var) {
		if (box.get() == var) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean compBox(Box03<String> box, String str) {
		if (box.get() == str) {
			return true;
		} else {
			return false;
		}
	}
}