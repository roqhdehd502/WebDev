package secondWeek.rec;

public class BankAccount {
	private String accNumber; // 계좌번호
	private String ssNumber; // 주민번호
	private int balance = 0; // 예금 잔액
	
	// 생성자(Constructor) 함수
	public BankAccount(String acc, String ss, int bal) {
		this.accNumber = acc;
		this.ssNumber = ss;
		this.balance = bal;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMybalance() {
		System.out.println("잔액: " + balance);
		return balance;
	}
}
