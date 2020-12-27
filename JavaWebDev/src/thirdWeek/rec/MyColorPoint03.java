package thirdWeek.rec;

public class MyColorPoint03 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3); // 1,2,3은 각각 x, y, z축의 값.
		System.out.print(p.toString()+"입니다.");
		System.out.println(" : 초기점");
		
		p.moveUp(); // z 축으로 위쪽 이동
		System.out.print(p.toString()+"입니다.");
		System.out.println(" : 첫 번째 이동");
		
		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // x, y 축으로 이동
		System.out.print(p.toString()+"입니다.");
		System.out.println(" : 두 번째 이동");
		
		p.move(100, 200, 300); // x, y, z축으로 이동
		System.out.print(p.toString()+"입니다.");
		System.out.println(" : 마지막 이동");
	}
}