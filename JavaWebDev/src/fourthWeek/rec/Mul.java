package fourthWeek.rec;

public class Mul extends Calc{
	private int a, b;
	
	public Mul(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate() {
		return a * b;
	}
}