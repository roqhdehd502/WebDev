package fourthWeek.rec.ArraySort;

public class Person implements Comparable {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "님의 나이는 " + age + "세 입니다.";
	}

	@Override
	public int compareTo(Object o) {
		return ((Person) o).getName().length() - getName().length();
	}
}