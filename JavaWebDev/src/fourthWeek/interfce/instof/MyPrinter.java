package fourthWeek.interfce.instof;

public class MyPrinter {

	public static void main(String[] args) {
		Printable prn1 = new SimplePrinter();
		Printable prn2 = new MultiPrinter();
		
		if (prn1 instanceof Printable) {
			prn1.printLine("This is a simple printer");
		}
		System.out.println();
		if (prn2 instanceof Printable) {
			prn2.printLine("This is a multiful printer");
		}
	}
}