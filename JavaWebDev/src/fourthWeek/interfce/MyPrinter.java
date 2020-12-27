package fourthWeek.interfce;

public class MyPrinter {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		// 삼성 프린터로 출력
		Printable prn = new SPrinterDriver(); // 다형성에 의하여 구현된 클래스 호출
		prn.print(myDoc);
		System.out.println();
		
		// LG 프린터로 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}
}