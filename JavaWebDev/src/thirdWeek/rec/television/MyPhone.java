package thirdWeek.rec.television;

public class MyPhone {

	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-777", "Nougat");
		MobilePhone ph2 = new SmartPhone("010-999-333", "Nougat");
		
		ph1.answer(); // 부모에게 상속받은 기능이기 때문에 호출가능
		ph1.playApp(); // 자식이 가지고 있는 기능이기 때문에 호출가능
		System.out.println();
		
		ph2.answer(); // 부모가 가지고 있는 기능이기 때문에 호출가능
		// ph2.playApp(); // 부모에게는 없는 자식의 기능이기 때문에 에러
	}

}
