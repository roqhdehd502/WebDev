package secondWeek.rec;

public class Summary {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getSum() {
		int sum = 0;
		for (int i = -1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
}