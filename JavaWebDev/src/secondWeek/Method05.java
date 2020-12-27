package secondWeek;


public class Method05 {

	public static void main(String[] args) { // 성적표
		int kor = 80;
		int eng = 80;
		int mat = 60;

		System.out.println(getGrade(kor, eng, mat));
	}

	private static char getGrade(int kor, int eng, int mat) {
		double avg = ((double)kor + eng + mat) / 3;
		char getChar;
		
		System.out.print("당신의 점수는 " + Math.round(avg) + "점이고, ");
		
		if (avg >= 90) {
			getChar = '수';
		} else if (avg >= 80) {
			getChar = '우';
		} else if (avg >= 70) {
			getChar = '미';
		} else if (avg >= 60) {
			getChar = '양';
		} else {
			getChar = '가';
		}
		
		return getChar;
	}
}