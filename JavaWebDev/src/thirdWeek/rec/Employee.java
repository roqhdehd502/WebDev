package thirdWeek.rec;

public class Employee {
	int age; // 나이
	int salary; // 급여
	String name; // 이름
	String address; // 주소
	String department; // 부서
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, int salary, String address, String department) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.department = department;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}