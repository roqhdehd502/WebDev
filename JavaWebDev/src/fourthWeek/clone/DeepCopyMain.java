package fourthWeek.clone;

public class DeepCopyMain {
	public static void main(String[] args) {
		RectangleDeep org = new RectangleDeep(1, 1, 9, 9);
		RectangleDeep cpy;

		try {
			// 인스턴스 복사
			cpy = (RectangleDeep)org.clone();

			// 인스턴스의 좌표 정보를 수정
			org.changePos(2, 2, 7, 7); // 원본을 변경하여도

			org.showPosition();
			cpy.showPosition(); // 복사한 것은 변경되지 않는다.
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
