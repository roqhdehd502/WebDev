package secondWeek.rec;

public class Gugudan {
	private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void printGugu(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " x " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}