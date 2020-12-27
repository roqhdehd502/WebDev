package fifthWeek.rec;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return age % 10;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (name == ((Person)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return name + "(" + age + "세)";
	}
}