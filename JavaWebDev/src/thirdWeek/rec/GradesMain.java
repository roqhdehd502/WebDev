package thirdWeek.rec;

import java.util.Scanner;

public class GradesMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		String name;
		int i = 0;
		
		while (true) {
			System.out.println("과목이름>>");
			name = scanner.next();
			
			if (name.equals("그만")) {
				break;
			}
			
			for (i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					System.out.println(course[i] +  "의 점수는 " + score[i]);
					break;
				}
			}
			
			if (i == course.length) {
				System.out.println("없는 과목입니다.");
			}
		}
		scanner.close();
	}
}