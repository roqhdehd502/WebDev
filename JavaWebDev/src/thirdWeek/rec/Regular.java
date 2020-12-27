package thirdWeek.rec;

public class Regular extends Employee {
	public Regular() {
		
	}
	
	public Regular(String name, int age, int salary, String address, String department) {
		super(name, age, salary, address, department);
	}
	
	@Override
	public int getAge() {
		return age;
	}
	
	@Override
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int getSalary() {
		return salary;
	}
	
	@Override
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getAddress() {
		return address;
	}
	
	@Override
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String getDepartment() {
		return department;
	}
	
	@Override
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String toString() {
		return "정규직";
	}
}