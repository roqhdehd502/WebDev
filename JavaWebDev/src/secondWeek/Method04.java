package secondWeek;

public class Method04 {
	public static void main(String[] args) {
		System.out.println(getGrade(11.5));
	}
	
	private static char getGrade(double avg) {
		char getChar;
		System.out.print("당신의 점수는 " + avg + "점이고, ");
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
