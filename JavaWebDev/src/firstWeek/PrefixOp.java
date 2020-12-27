package firstWeek;

import javax.naming.spi.DirStateFactory.Result;

public class PrefixOp {

	public static void main(String[] args) {
		int num = 5;
		System.out.println("num++: " + num++); // 후위 연산자는 해당 과정에서 선출력 한 뒤 후연산하는 구조를 가지고있다.
		System.out.println("num++: " + num++);
		System.out.println("num: " + num);
		System.out.println("num--: " + num--);
		System.out.println("num--: " + num--);
		System.out.println("num: " + num);
		
		int num1 = 7;
		int result = ++num1 - 5;
		System.out.println(num1 + " " + result);
		result = (num1++) - 5;
		System.out.println(num1 + " " + result);
		System.out.println(num1 + " " + result);
		
		int x = 10;
		int y = x-- + 5 + --x;
		System.out.println(y + " " + x);
	}
}