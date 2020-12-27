package fifthWeek.rec;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PopulationMain {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		HashMap<String, Integer> map =
				new HashMap<>();
		
		System.out.println("나라 이름과 인구를 입력하세요.");
		System.out.println("ex) Korea 5000");
		
		try {
			while (true) {
				System.out.print("나라 이름, 인구 >> ");
				String str = scanner.nextLine();
				
				if (str.equals("그만"))
					break;
				String[] temp = str.split(" ");

				String cntry = temp[0]; 
				Integer pop = Integer.parseInt(temp[1]);
				map.put(cntry, pop);
			}
			
			while (true) {
				System.out.print("인구 검색 >> ");
				String cntry = scanner.next();
				
				if (cntry.equals("그만"))
					break;	
				Integer result = map.get(cntry);
				
				if (result == null)
					System.out.println(cntry + " 나라는 없습니다.");
				else
					System.out.println(cntry + "의 인구는 " + result);
			}
		} catch (NoSuchElementException e) {
			System.out.println("잘못된 입력 값 입니다.");
			System.out.println("쉼표 및 띄어쓰기를 누락하지 않으셨는지 다시 확인 후 입력해주세요.");
		}
		
		scanner.close();
	}
}