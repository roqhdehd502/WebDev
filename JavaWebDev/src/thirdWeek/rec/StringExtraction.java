package thirdWeek.rec;

import java.util.Scanner;

public class StringExtraction {
	private String rnum;
	
	public StringExtraction() {	
		
	}
	
	public StringExtraction(String rnum) {	
		this.rnum = rnum;
	}

	public String getRnum() {
		return rnum;
	}

	public void setRnum(String rnum) {
		this.rnum = rnum;
	}

	private void inputRnum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("당신의 주민등록번호 13자리를 -까지 포함하여 입력해주세요.");
		rnum = scanner.next();
		scanner.close();
	}
	
	private String rnumFront() {
		return rnum.substring(0, 6); // 주민번호 앞자리 6개 추출
	}
	
	private String rnumBack() {
		return rnum.substring(7, 14); // 주민번호 앞자리 6개 추출
	}
	
	public void user() {
		inputRnum();
		System.out.println("변환된 당신의 주민등록번호는 " + rnumFront() + " " + rnumBack() + "입니다.");
	}
}