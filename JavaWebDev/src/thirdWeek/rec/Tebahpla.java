package thirdWeek.rec;

import java.util.regex.Pattern;

public class Tebahpla {
	private String input;
	
	public Tebahpla(String input) {
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
	
	public static String reverseString(String input) { // StringBuffer.reverse를 이용하여 문자열 뒤집기
	    return ( new StringBuffer(input) ).reverse().toString();
	}

	public void show() {
		System.out.println(reverseString(input) + " 으로 출력되었습니다.");
	}
}