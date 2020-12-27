package fourthWeek.interfce.instof;

public class MultiPrinter extends SimplePrinter{
	public void printLine(String str) {
		super.printLine("start of multi...");
		super.printLine(str);
		super.printLine("end of multi");
	}
}