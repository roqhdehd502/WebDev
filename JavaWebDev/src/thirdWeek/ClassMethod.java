package thirdWeek;

public class ClassMethod {

	public static void main(String[] args) {
		NumberPrinter.showInt(20); // 외부 접근. 객체를 생성 안했음에도 불러올 수 있다.
		NumberPrinter np = new NumberPrinter();
		NumberPrinter.showDouble(3.15); // 외부 접근
		np.setMyNumber(75);
		np.showMynumber();
	}
}