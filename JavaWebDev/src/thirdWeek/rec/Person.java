package thirdWeek.rec;

public class Person {
	private int card;
	private String user;
	
	public Person(int card) {
		this.card = card;
	}

	public Person(String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}
}