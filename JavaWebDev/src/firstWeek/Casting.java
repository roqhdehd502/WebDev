package firstWeek;

public class Casting {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		double result = (double)a/b; // 선언한 a,b가 int 타입이어서 데이터 타입이 맞지않으므로, 피연산하는 변수 둘 중 하나를 캐스팅한다.
		System.out.println(result);
	}
}