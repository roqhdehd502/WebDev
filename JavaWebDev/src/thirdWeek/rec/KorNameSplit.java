package thirdWeek.rec;

import java.util.Scanner;

public class KorNameSplit {
	private String name;

	public KorNameSplit() {

	}

	public KorNameSplit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void inputName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("당신의 한글명을 띄어서 입력해주세요.");
		System.out.println("ex) 홍 길동");
		System.out.print("입력: ");
		name = scanner.nextLine();
		scanner.close();
	}
	
	private static boolean isBlank(String name) { // 문자열 공백여부 검사
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				return true;
			}
		}
		return false; // 공백이 없으면 false로 리턴
	}

	private String firstName() {
		String[] nmeSplt = name.split(" ");
		return nmeSplt[1];
	}

	private String lastName() {
		String[] nmeSplt = name.split(" ");
		return nmeSplt[0];
	}

	public void user() {
		inputName();
		
		if ((isBlank(name)) == false) {
			System.out.println("공백이 없군요. 다시 입력해주세요.");
		} else {
			System.out.println("성 = " + lastName() + ", 이름 = " + firstName());
		}
	}
}
