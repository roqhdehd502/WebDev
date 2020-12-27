package fifthWeek.rec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class StudentGradeMain02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student> map =
				new HashMap<>();
		Student[] student = new Student[4];
		
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		System.out.println("ex) 황기태, 모바일, 1, 4.1");
		
		try {
			for (int i = 0; i < student.length; i++) {
				System.out.print(">> ");
				String str = scanner.nextLine();
				String[] temp = str.split(", ");
				
				String name = temp[0];
				String dept = temp[1];
				int classNum = Integer.parseInt(temp[2]);
				double grdAvg = Double.parseDouble(temp[3]);
				
				student[i] = new Student(name, dept, classNum, grdAvg);
				map.put(name, student[i]);
			}
			Set<String> key = map.keySet();
			Iterator<String> itr = key.iterator();
			System.out.println("----------------------------------");
			
			while(itr.hasNext()) {
				String name = itr.next();
				Student s = map.get(name);
				System.out.println(s);
			}
			System.out.println("----------------------------------");
			
			while(true) {
				System.out.print("학생 이름 >> ");
				String name = scanner.next();
				
				if(name.equals("그만"))
					break;
				
				Student s = map.get(name);
				
				if(s == null)
					System.out.println(name + "님의 정보는 없습니다.");
				else
					System.out.println(s.getName() + " "
							+ s.getDept() + " "
							+ s.getClassNum() + " "
							+ s.getGrdAvg());
			}
		} catch (NoSuchElementException e) {
			System.out.println("잘못된 입력 값 입니다.");
			System.out.println("쉼표 및 띄어쓰기를 누락하지 않으셨는지 다시 확인 후 입력해주세요.");
		}
		
		scanner.close();
	}
}