package fourthWeek.rec;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		
		try {
			size = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("올바르지 않은 입력 값 입니다. 다시 입력해주세요!");
		}
		
		StackApp stack = new StackApp(size);
		
		for (int i = 0; i < stack.capacity(); i++) {
			System.out.print("문자열 입력 >> ");
			String str = scanner.next();
			
			if (str.equals("그만"))
				break;
			
			stack.push(str);
		}

		stack.printStack();
		
		scanner.close();
	}
}