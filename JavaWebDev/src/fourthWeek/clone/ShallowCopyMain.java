package fourthWeek.clone;

public class ShallowCopyMain {

	public static void main(String[] args) {
		RectangleShallow org = new RectangleShallow(1, 1, 9, 9); // 원래의 좌표
		RectangleShallow cpy;

		try {
			// 인스턴스 복사
			cpy = (RectangleShallow)org.clone();

			// 인스턴스의 좌표 정보를 수정
			org.changePos(2, 2, 7, 7); // 원본을 변경하면

			org.showPosition();
			cpy.showPosition(); // 복사한 것도 변경된다.
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}