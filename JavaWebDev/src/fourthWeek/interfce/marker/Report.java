package fourthWeek.interfce.marker;

public class Report implements Printable, Upper {
	String cons;
	
	public Report(String cons) {
		this.cons = cons;
	}
	
	public String getContents() {
		return cons;
	}
}
