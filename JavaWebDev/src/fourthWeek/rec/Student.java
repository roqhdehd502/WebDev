package fourthWeek.rec;

import java.io.IOException;
import java.util.Scanner;

public class Student extends Person {
	int classOf; // 학번
	double avg[] = new double[8]; // 평균 학점 배열
	String schoolName; // 학교명
	String department; // 학과
	
	Scanner scanner = new Scanner(System.in);
	
	public Student() {
		super(); // 상속받은 Person 객체의 age, name, address 필드 변수 가져오기 
	}
	
	public Student(String schoolName, String department, int classOf) {
		this.schoolName = schoolName;
		this.department = department;
		this.classOf = classOf;
	}
	
	public void getInfo() throws IOException { // 학생의 인적사항 입력
		System.out.print("주소 : ");
		address = scanner.next();
		System.out.print("학교 : ");
		schoolName = scanner.next();
		System.out.print("학과 : ");
		department = scanner.next();
		System.out.print("학번 : ");
		classOf = scanner.nextInt();
		System.out.println("----------------------------------------");
	}
	
	public void getAvg() throws IOException { // 학생의 평균 학점 입력
		System.out.println("8학기 학점을 순서대로 입력하세요.");
		System.out.println();
		for (int i = 0; i < avg.length; i++) {
			System.out.print((i+1) + "학기 학점 -> ");
			avg[i] = scanner.nextDouble();
		}
		System.out.println();
		System.out.println("----------------------------------------");
	}
	
	public void average() { // 학생의 평균 학점 출력
		double sum = 0;
		
		try { // throw한 예외처리들을 average 메소드에서 받기
			getInfo();
			getAvg();
			
			for (int i = 0; i < avg.length; i++) { // 입력한 학점의 평균 구하기
				sum += avg[i];
			}
			
			System.out.println(avg.length + "학기 총 평균 학점은 " + (sum / avg.length) + "점 입니다.");
		} catch (IOException e) {
			System.out.println("올바르지 않은 입력 값 입니다. 다시 입력해주세요!");
		}
	}
}