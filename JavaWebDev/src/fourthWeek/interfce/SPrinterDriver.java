package fourthWeek.interfce;

public class SPrinterDriver implements Printable { // Printable 인터페이스 구현
	@Override // 추상 메소드 오버라이딩
	public void print(String doc) {
		System.out.println("From Samsung Printer");
		System.out.println(doc);
	}
}