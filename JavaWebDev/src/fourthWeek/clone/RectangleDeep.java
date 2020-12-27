package fourthWeek.clone;

public class RectangleDeep implements Cloneable  {
    private Point upperLeft; // 좌측 상단 좌표
    private Point lowerRight; // 우측 하단 좌표
    
    public RectangleDeep(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    // 좌표 정보를 수정함
    public void changePos(int x1, int y1, int x2, int y2) {
        upperLeft.changePos(x1, y1);
        lowerRight.changePos(x2, y2);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Object 클래스의 clone 메소드 호출 결과를 얻음
    	// 깊은 복사를 위해 copy라는 객체를 재귀하여 따로 생성
    	RectangleDeep copy = (RectangleDeep)super.clone();

        // 깊은 복사의 형태로 복사본을 수정
        copy.upperLeft = (Point)upperLeft.clone();
        copy.lowerRight = (Point)lowerRight.clone();
        
        // 완성된 복사본의 참조를 반환
        return copy;        
    }

    // 직사각형 좌표 정보 출력    
    public void showPosition() {
        System.out.print("좌측 상단: ");
        upperLeft.showPosition();
        
        System.out.print("우측 하단: ");
        lowerRight.showPosition();
        System.out.println(); 
    }
}