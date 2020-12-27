package secondWeek;

public class InstCnt {
	static int instNum = 0;
	
	public InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
}
