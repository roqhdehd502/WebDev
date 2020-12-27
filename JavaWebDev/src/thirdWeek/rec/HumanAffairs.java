package thirdWeek.rec;

import java.util.Scanner;

public class HumanAffairs {
	Scanner scanner = new Scanner(System.in);
	Employee regular = new Regular();
	Employee temporary = new Temporary();
	
	int age; // 나이
	int salary; // 급여
	String name; // 이름
	String address; // 주소
	String department; // 부서
	
	// 정규직
	private String writeRegularName() {
		System.out.print("당신의 이름을 입력하시오. >> ");
		name = scanner.next();
		regular.setName(name);
		return regular.getName();
	}
	
	private int writeRegularAge() {
		System.out.print("당신의 나이를 입력하시오. >> ");
		age = scanner.nextInt();
		regular.setAge(age);
		return regular.getAge();
	}
	
	private String writeRegularAddress() {
		System.out.print("당신의 주소를 입력하시오. >> ");
		address = scanner.next();
		regular.setAddress(address);
		return regular.getAddress();
	}
	
	private String writeRegularDepartment() {
		System.out.print("당신의 부서를 입력하시오. >> ");
		department = scanner.next();
		regular.setDepartment(department);
		return regular.getDepartment();
	}
	
	private int writeRegularSalary() {
		System.out.print("당신의 급여를 입력하시오. >> ");
		salary = scanner.nextInt();
		regular.setSalary(salary);
		return regular.getSalary();
	}
	
	// 비정규직
	private String writeTemporaryName() {
		System.out.print("당신의 이름을 입력하시오. >> ");
		name = scanner.next();
		temporary.setName(name);
		return temporary.getName();
	}
	
	private int writeTemporaryAge() {
		System.out.print("당신의 나이를 입력하시오. >> ");
		age = scanner.nextInt();
		temporary.setAge(age);
		return temporary.getAge();
	}
	
	private String writeTemporaryAddress() {
		System.out.print("당신의 주소를 입력하시오. >> ");
		address = scanner.next();
		temporary.setAddress(address);
		return temporary.getAddress();
	}
	
	private String writeTemporaryDepartment() {
		System.out.print("당신의 부서를 입력하시오. >> ");
		department = scanner.next();
		temporary.setDepartment(department);
		return temporary.getDepartment();
	}
	
	private int writeTemporarySalary() {
		System.out.print("당신의 급여를 입력하시오. >> ");
		salary = scanner.nextInt();
		temporary.setSalary(salary);
		return temporary.getSalary();
	}
	
	private void getInfo() { // 예시용으로 정규직 정보만 가져오기
		writeRegularName();
		writeRegularAge();
		writeRegularAddress();
		writeRegularDepartment();
		writeRegularSalary();
	}
	
	public void printInfo() { // 정보 출력
		getInfo();
		System.out.println(regular.toString()+ " " + regular.getName() + "님의 직원 정보는 다음과 같습니다.");
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("이 름:\t" + regular.getName());
		System.out.println("나 이:\t" + regular.getAge());
		System.out.println("주 소:\t" + regular.getAddress());
		System.out.println("부 서:\t" + regular.getDepartment());
		System.out.println("급 여:\t" + regular.getSalary());
	}
}