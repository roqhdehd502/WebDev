package thirdWeek;

public class BoxxMain {

	public static void main(String[] args) {
		Boxx[] ar = new Boxx[3];
		
		// 배열에 인스턴스 저장
		ar[0] = new Boxx("First");
		ar[1] = new Boxx("Second");
		ar[2] = new Boxx("Third");
		
		// 저장된 인스턴스의 참조
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}

}
