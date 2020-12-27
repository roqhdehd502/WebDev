package fourthWeek.interfce.marker;

public class MarkerInterface {

	public static void main(String[] args) {
		Printer prn = new Printer();
		
		Report doc = new Report("Simple funny News~");
		prn.printContents(doc);
	}
}