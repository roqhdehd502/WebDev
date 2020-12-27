package thirdWeek.rec;

import java.util.Scanner;

public class BMIMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신의 키를 입력해주세요[cm]: ");
		double height = scanner.nextDouble();
		System.out.print("당신의 몸무게를 입력해주세요[kg]: ");
		double weight = scanner.nextDouble();
		
		BMI bmi = new BMI(height, weight);
		
		bmi.show();
		
		scanner.close();
	}
}