package fourthWeek;

public class BoxingMain {

	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox(); // extends Box
		GoldPaperBox box3 = new GoldPaperBox(); // extends PaperBox
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
	
	public static void wrapBox(Box box) { // 파라미터로 상위 클래스 타입 참조
		if (box instanceof GoldPaperBox) { // 부모 객체가 손주타입이면
			((GoldPaperBox)box).goldWrap(); // 손주 클래스 타입으로 캐스팅
		} else if (box instanceof PaperBox) { // 부모 객체가 자식타입이면
			((PaperBox)box).paperWrap(); // 자식 클래스 타입으로 캐스팅
		} else { // 둘 다 타입이 안되면
			box.simpleWrap(); // 캐스팅을 하지 않고 본인 메소드꺼 출력
		}
	}
}