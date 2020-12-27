package secondWeek.rec;

public class StarPrint {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void printTriangle(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void printReverseTriangle(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}