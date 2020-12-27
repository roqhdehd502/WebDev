package fourthWeek.compareToArray;

public class Person implements Comparable {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		Person person = (Person)o;
		// 연산결과에 따라 음수, 0, 양수 값이 되게 리턴
		return this.age - person.age;
	}
	
	@Override
	public String toString() {
		return name + ": " + age;
	}
}
