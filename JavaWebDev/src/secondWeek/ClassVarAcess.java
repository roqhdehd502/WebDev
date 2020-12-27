package secondWeek;

public class ClassVarAcess {

	public static void main(String[] args) {
		AccessWay way = new AccessWay();
		
		way.num++; // 외부에서 객체(인스턴스)의 이름을 통한 접근
		AccessWay.num++; // 외부에서 클래스의 이름을 통한 접근
		
		System.out.println("way.num = " + way.num);
		System.out.println("AccessWay.num = " + AccessWay.num);
	}

}
