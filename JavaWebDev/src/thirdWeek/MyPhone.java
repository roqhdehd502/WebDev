package thirdWeek;

public class MyPhone {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-555-777", "Nougat");
		phone.answer(); // 전화를 받는다.
		phone.playApp(); // 앱을 선택하고 실행한다.
	}
}