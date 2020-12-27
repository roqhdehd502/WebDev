package fourthWeek.rec.compare;

import java.util.Scanner;

public class RectangleMain02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle02[] rec = new Rectangle02[4];
		
		for (int i = 0; i < rec.length; i++) {
			System.out.println("입력할 사각형의 가로(width)와 세로(height)의 길이를 입력해주세요.");
			System.out.print("가로 >> ");
			int width = scanner.nextInt();
			System.out.print("세로 >> ");
			int height = scanner.nextInt();
			
			rec[i] = new Rectangle02(width, height);
			System.out.println();
		}
		
		System.out.println("Unordered Elements >> ");
		for (int i = 0; i < rec.length; i++) {
			System.out.println((i+1) + "번 사각형 넓이: " + rec[i].getArea());
		}
		System.out.println();
		
		System.out.println("Ordered Elements >> ");
		Rectangle02[] recSorting = Rectangle02.getSortingRec(rec); // sorting(DESC)
		for (int i = 0; i < recSorting.length; i++) {
			System.out.println((i+1) + "번 사각형 넓이: " + recSorting[i].getArea());
		}
		
		scanner.close();
	}
}