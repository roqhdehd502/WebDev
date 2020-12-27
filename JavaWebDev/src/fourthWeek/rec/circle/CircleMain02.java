package fourthWeek.rec.circle;

public class CircleMain02 {

	public static void main(String[] args) {
		Shape[] list = new Shape[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		   list[0] = new Circle(10); // 반지름이 10인 원 객체
		   list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
		   list[2] = new Rect(10, 40); // 10x40 크기의 사각형
		   for(int i=0; i<list.length; i++) list[i].redraw();
		   for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
	}

}
