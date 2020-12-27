package fifthWeek.rec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxNumMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("정수를 입력하시고 그만 입력하고자 한다면 끝에 -1을 기입하세요.");
		System.out.println("ex. 10 6 22 6 88 77 -1");
		System.out.println("------------------------------------------------");
		
		try {
			while (true) {
				int var = scanner.nextInt();
				list.add(var);
				
				if (list.contains(-1)) {
					break;
				} else {
					continue;
				}
			}

			System.out.println("가장 큰 수는 " + Collections.max(list));
		} catch (InputMismatchException e) {
			System.out.println("올바르지 않은 입력 값 입니다. 다시 입력해주세요!");
		}
		
		scanner.close();
	}
}