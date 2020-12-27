package thirdWeek.rec;

import java.util.Scanner;

public class NameExtract {
	private String name;

	public NameExtract() {
		
	}
	
	public NameExtract(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private void inputName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("당신의 영문명을 띄어서 입력해주세요.");
		System.out.println("ex) Minwoo Na");
		System.out.print("입력: ");
		name = scanner.nextLine();
		scanner.close();
	}
	
	private String firstName() {
		String[] nmeSplt = name.split(" ");
		return nmeSplt[0];
	}
	
	private String lastName() {
		String[] nmeSplt = name.split(" ");
		return nmeSplt[1];
	}

	public void user() {
		inputName();
		System.out.println("First Name: " + firstName() + ", Last Name: " + lastName());
	}
}