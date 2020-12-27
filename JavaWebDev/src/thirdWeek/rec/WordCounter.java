package thirdWeek.rec;

import java.util.Scanner;

public class WordCounter {
	private String sentence;
	
	public WordCounter() {

	}

	public WordCounter(String sentence) {
		this.sentence = sentence;
	}
	
	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	private void inputSentence() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문장을 입력해주시거나, 프로그램을 종료하고 싶으시면 \"그만\"을 입력해주세요.");
		System.out.println("ex) Java Programming");
		System.out.println("ex) 그만");
		System.out.print("입력: ");
		sentence = scanner.nextLine();
	}
	
	private boolean iQuit() {
		if (sentence.equals("그만")) {
			return false; // 프로그램 종료 희망시 false로 리턴
		} else {
			return true;
		}
	}
	
	private int wrdCnt() {
		if (iQuit() == true) {
			String[] spltStnce = sentence.split(" ");
			return spltStnce.length;
		} else {
			return 0;
		}
	}

	public void user() {
		while (true) {
			inputSentence();
			if (iQuit() == false) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("단어의 개수는 " + wrdCnt() + "\n");
				continue;
			}
		}
	}
}