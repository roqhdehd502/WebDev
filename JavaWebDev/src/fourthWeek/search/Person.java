package fourthWeek.search;

public class Person implements Comparable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		return this.age - p.age;
	}
	
	@Override
	public String toString() {
		return name + ": " + age;
	}
}
