package fourthWeek.rec;

public class MyFruit {

	public static void main(String[] args) {
		Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
		
		for (Fruit f : fAry)
			f.print();
	}
}