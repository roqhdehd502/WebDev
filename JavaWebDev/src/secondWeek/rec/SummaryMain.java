package secondWeek.rec;

public class SummaryMain {

	public static void main(String[] args) {
		Summary summary = new Summary();
		
		int num = 5; // 지정 변수 num 선언 및 초기화
		
		summary.setNum(num);
		System.out.println(summary.getSum()); // 값 출력
	}
}
