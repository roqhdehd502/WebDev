package edu.bit.ex.bean;

import java.util.Random;

public class Rsp {
	Random random = new Random();
	
	private int com; // 컴퓨터
	private String user; // 유저
	
	public Rsp() {
		
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getCom() { // 리턴 값(1: 가위, 2: 바위, 3: 보)
		com = random.nextInt(3) + 1;
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	public String compareResult(String user) {
		String result = "";
		
		switch(com) {
		case 1 : // 가위
			if(user.equals("가위")) {
				result = "비김";
			} else if(user.equals("바위")) {
				result = "승리";
			} else if(user.equals("보")) {
				result = "패배";
			}
			break;
		case 2 : // 바위
			if(user.equals("가위")) {
				result = "패배";
			} else if(user.equals("바위")) {
				result = "비김";
			} else if(user.equals("보")) {
				result = "승리";
			}
			break;
		case 3 : // 보
			if(user.equals("가위")) {
				result = "승리";
			} else if(user.equals("바위")) {
				result = "패배";
			} else if(user.equals("보")) {
				result = "비김";
			}
			break;
		}
		return result;
	}
}