package fifthWeek.collectionFrameWork;

public class Num {
	private int num;
	
	public Num(int n) {
		num = n;
	}
	
	@Override
	public int hashCode() {
		return num % 3; // num의 값이 같으면 부류도 같다.
	}
	
	@Override
	public boolean equals(Object obj) { // num의 값이 같으면 true 반환
		if (num == ((Num)obj).num) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
}
