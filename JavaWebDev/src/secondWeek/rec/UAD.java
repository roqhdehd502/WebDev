package secondWeek.rec;

public class UAD {
	private static int com; // 값이 새로 초기화되지 않고 매 번 참조만 하기 때문에 클래스 변수
	private int user; // 값이 새로 초기화되어 매 번 참조를 하기 때문에 인스턴스 변수
	
	public UAD(int user, int com) {
		this.user = user;
		UAD.com = com;
	}

	public int getUser() {
		return user;
	}

	public boolean setUser(int user) { // 입력 값 유효성 검사
		this.user = user;
		
		Integer wnum = new Integer(user); // int -> Integer로 박싱하여 객체 비교
		
		if (!(wnum instanceof Integer)) {
			System.out.println("올바르지 않은 숫자 값 입니다. 다시 입력해주세요.");
			return false;
		} else {
			return true;
		}
	}
	
	public int getCom() {
		return com;
	}
	
	public void setCom(int com) {
		UAD.com = com;
	}

	public int getResult() {
		int result = 0;
		
		if (user < com) { // UP
			result = 1;
		} else if (user > com) { // DOWN
			result = 2;
		} else if (user == com) { // CORRECT
			result = 0;
		}
		
		return result;
	}
}