package thirdWeek.rec;

public class Prime {
	private int rnum;
	
	public Prime(int rnum) {
		this.rnum = rnum;
	}

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}

	public void show() {
		System.out.println("임의의 정수는 " + rnum + " (으)로");
		System.out.print("소수는 ");
		
		for (int i = 2; i <= rnum; i++) {
			boolean isPrime = true;
			
			for (int j = 2; j*j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				System.out.print(i + " ");
			}
		}
		System.out.println("입니다.");
	}
}