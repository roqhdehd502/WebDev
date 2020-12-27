package firstWeek;

public class BitShiftOp {

	public static void main(String[] args) {
		byte num = 2;
		
		System.out.println(num << 1);
		System.out.println(num << 2);
		System.out.println(num << 3);
		System.out.println();
		
		num = 0;
		System.out.println(num >> 1);
		System.out.println(num >> 2);
		System.out.println(num >> 3);
		System.out.println();
		
		num = -8;
		System.out.println(num >> 1);
		System.out.println(num >> 2);
		System.out.println(num >> 3);
	}

}
