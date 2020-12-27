package thirdWeek;

public class BusinessMan extends Man {
	String company;
	String position;
	
	public BusinessMan() {

	}
	
	public BusinessMan(String name, String company, String position) {
		this.name = name;
		this.company = company;
		this.position = position;
	}
	
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}
}
