package fourthWeek.interfce.marker;

public class Printer {
	public void printContents(Printable doc) {
		
		if (doc instanceof Upper) {
			System.out.println((doc.getContents()).toUpperCase());
		} else if (doc instanceof Lower) {
			System.out.println((doc.getContents()).toLowerCase());
		}
	}
}
