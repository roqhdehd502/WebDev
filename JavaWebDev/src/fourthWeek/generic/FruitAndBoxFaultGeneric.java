package fourthWeek.generic;

public class FruitAndBoxFaultGeneric {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();

		// 과일을 박스에 담은 것일까? 
		//aBox.set("Apple");
		//oBox.set("Orange");
		aBox.set(new Apple());
		oBox.set(new Orange());


		// 박스에서 과일을 제대로 꺼낼 수 있을까?
		Apple ap = aBox.get();
		Orange og = oBox.get();



		System.out.println(ap);
		System.out.println(og);
	}
}