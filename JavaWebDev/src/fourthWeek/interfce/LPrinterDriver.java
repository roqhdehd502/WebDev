package fourthWeek.interfce;

public class LPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG Printer");
		System.out.println(doc);
	}
}