package fourthWeek.interfce;

public class Calculator implements ICalculate {
	//private int x, y; // Overriding을 했으므로 필드에서 변수 선언 필요 x
	
	@Override
	public int add(int x, int y) {
		return x + y;
	}
	
	@Override
	public int sub(int x, int y) {
		return x - y;
	}
	
	@Override
	public int mul(int x, int y) {
		return x * y;
	}
	
	@Override
	public int div(int x, int y) {
		return x / y;
	}
}