package thirdWeek.rec;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class Grades {
	private String subject;
	private int[] score;
	private String[] course;

	public Grades() {
		score = new int[] {95, 88, 76, 62, 55};
		course = new String[] {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
	}
	
	public Grades(String subject, int[] score, String[] course) {
		this.subject = subject;
		this.score = score;
		this.course = course;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	private String inputSubject() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("과목명을 입력해주세요.");
		System.out.println("단, 종료를 원하시면 그만을 입력해주세요.");
		System.out.print("과목 이름 >> ");
		String subject = scanner.next();
		
		return subject;
	}
	
	private boolean isQuit() {
		if (inputSubject().equals("그만")) {
			System.out.println("프로그램을 종료합니다.");
			return false; // 종료를 원하면 false를 리턴
		} else {
			return true;
		}
	}
	
	private boolean isSubject() {
		boolean result = true;
		
		if (isQuit() == true) {
			for (int i = 0; i < course.length; i++) {
				if (!(inputSubject().equals(course[i]))) {
					result = false;
				}
				else {
					result = true;
				}
			}
		}
		return result;
	}
	
	public void getGrade() {
		if (isSubject() == true) {
			for (int i = 0; i < course.length; i++) {
				if (inputSubject().equals(course[i])) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
				}
			}
		}
	}

	public void user() {
		while (true) {
			inputSubject();
			if (isQuit() == false) {
				break;
			} else {
				isSubject();
				getGrade();
				continue;
			}
		}
	}
}