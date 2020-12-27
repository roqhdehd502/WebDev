package thirdWeek.rec;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotoo {
	private int[] ltNum = new int[6];
	private int[] com = new int[6];

	public Lotoo() {
		
	}
	
	public Lotoo(int[] ltNum, int[] com) {
		this.ltNum = ltNum;
		this.com = com;
	}

	public int[] getLtNum() {
		return ltNum;
	}

	public void setLtNum(int[] ltNum) {
		this.ltNum = ltNum;
	}
	
	public int[] getCom() {
		return com;
	}

	public void setCom(int[] com) {
		this.com = com;
	}

	private void inputLtNum() { // 로또 번호 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 ~ 45번까지 중복 없는 로또 번호를 6개 기입해주세요.");
		System.out.println("ex) 3 6 4 9 30 27");
		for (int i = 0; i < ltNum.length; i++) {
			ltNum[i] = scanner.nextInt();
		}
		Arrays.sort(ltNum); // 입력한 번호의 배열 요소 정렬
		scanner.close();
	}

	private boolean isOverlap() { // 입력한 로또 번호 중복 검사
		for (int i = 1; i < ltNum.length; i++) {
			if (ltNum[i-1] == ltNum[i]) {
				return false; // 두 요소 값이 같을 때(중복) false로 리턴
			}
		}
		return true;
	}

	private int[] getResult() { // 랜덤으로 로또 번호 생성
		Random random = new Random();
		for(int i = 0; i < com.length; i++) {
			com[i] = random.nextInt(45) + 1; // 1 ~ 45 사이의 숫자 생성 
			for(int j = 0; j < i; j++) {
				if(com[i]==com[j]) {
					i--; // 랜덤으로 생성된 로또 번호도 중복 값 배제
				}
			}
		}
		Arrays.sort(com); // 생성된 com 배열 요소 또한 정렬
		return com;
	}
	
	private int numCompare() { // 입력한 것과 랜덤으로 나온 로또 번호 비교
		int numCnt = 0;
		getResult();
		if (isOverlap() == true) {
			for (int i = 0; i < 6; i++) {
				if (ltNum[i] == com[i]) {
					numCnt++;
				}
			}
		} else if (isOverlap() == false) {
			return 0;
		}
		return numCnt;
	}
	
	private void getWinning() {
		if (isOverlap() == true) { // 중복없이 번호를 선택했을경우 결과 출력
			switch (numCompare()) { // 맞춘 숫자 개수 별 분기에 따라 출력
			case 0:
				System.out.println("안타깝습니다. 다음 기회에...");
				break;
			case 1:
				System.out.println("축하합니다. 1개 맞추셨습니다.");
				break;
			case 2:
				System.out.println("축하합니다. 2개 맞추셨습니다.");
				break;
			case 3:
				System.out.println("축하합니다. 3개 맞추셨습니다.");
				break;
			case 4:
				System.out.println("축하합니다. 4개 맞추셨습니다.");
				break;
			case 5:
				System.out.println("축하합니다. 5개 맞추셨습니다.");
				break;
			case 6:
				System.out.println("축하합니다. 6개 맞추셨습니다.");
				break;
			}
		} else {
			System.out.println("번호가 중복되었습니다. 다시 입력해주세요.");
		}
	}
	
	public void user() {
		inputLtNum();
		getWinning();
	}
}