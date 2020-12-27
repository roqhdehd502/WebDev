package thirdWeek;

public class Person {
	private int regiNum; // 주민등록번호
	private int passNum; // 여권번호

	public Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
	}
	
	
	public Person(int rnum) {
		regiNum = rnum;
		passNum = 0;
	}
	
	public void showPersonalInfo() {
		
	}

}
