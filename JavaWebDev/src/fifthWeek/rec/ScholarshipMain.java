package fifthWeek.rec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class ScholarshipMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> map = new HashMap<>();
		
		System.out.println("미래장학금 관리시스템입니다.");
		System.out.println("이름과 학점을 띄어써서 입력해주세요.");
		System.out.println("ex) 홍길동 3.5");
		
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.print("이름과 학점 >> ");
				
				String str = scanner.nextLine();
				String[] temp = str.split(" ");
				
				String name = temp[0];
				Double grade = Double.parseDouble(temp[1]);
				map.put(name, grade);
			}
			System.out.println();
			
			System.out.print("장학생 선발 학점 기준 입력 >> ");
			Double criteria = scanner.nextDouble();
			
			System.out.print("장학생 명단 : ");
			Set<String> nameSet = map.keySet();
			Iterator<String> it = nameSet.iterator();
			while(it.hasNext()) {
				String name = it.next();
				double score = map.get(name);
				if(score > criteria)
					System.out.print(name+ " ");
			}
		} catch (NoSuchElementException e) {
			System.out.println("잘못된 입력 값 입니다.");
			System.out.println("띄어쓰기를 누락하지 않으셨는지 다시 확인 후 입력해주세요.");
		}
		
		scanner.close();
	}
}