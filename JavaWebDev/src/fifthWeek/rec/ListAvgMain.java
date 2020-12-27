package fifthWeek.rec;

import java.util.ArrayList;
import java.util.Scanner;

public class ListAvgMain {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		
		System.out.println("6개의 학점을 띄어써서 입력해주세요.");
		System.out.println("ex) 수 우 수 미 수 가");
		System.out.print(">> ");
		String str = scanner.nextLine();
		String[] temp = str.split(" ");
		
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals("수")) {
				list.add(4.0);
			} else if (temp[i].equals("우")) {
				list.add(3.0);
			} else if (temp[i].equals("미")) {
				list.add(2.0);
			} else if (temp[i].equals("양")) {
				list.add(1.0);
			} else if (temp[i].equals("가")) {
				list.add(0.0);
			}
		}
		
		double sum = list.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println("당신의 평균은 " + ((double)Math.round((sum / 6)*100)/100) + " 입니다.");
		
		scanner.close();
	}
}