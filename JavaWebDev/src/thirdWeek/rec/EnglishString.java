package thirdWeek.rec;

import java.util.regex.Pattern;

public class EnglishString {
	private String input;
	
	public EnglishString(String input) {
		this.input = input;
	}
	
	public String getInput() {
		return input;
	}
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public boolean isAlpha(String input) { // 알파벳 유효성 검사
	    return Pattern.matches("^[a-zA-Z]*$", input);
	}

	public void show() {
		int vcnt = 0; // 모음
		int ccnt = 0; // 자음
		input = input.toLowerCase(); // 대문자 -> 소문자 변환
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' // char로 캐스팅하여 문자 비교
					|| input.charAt(i) == 'i' 
					|| input.charAt(i) == 'u' 
					|| input.charAt(i) == 'e' 
					|| input.charAt(i) == 'o') {
				vcnt++;
			} else {
				ccnt++;
			}
		}
		
		System.out.println("모음 수: " + vcnt);
		System.out.println("자음 수: " + ccnt);
	}
}
