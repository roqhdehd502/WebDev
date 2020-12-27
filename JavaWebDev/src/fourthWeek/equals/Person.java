package fourthWeek.equals;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name == ((Person)obj).name) {
			return true;
		} else {
			return false;
		}
	}
}