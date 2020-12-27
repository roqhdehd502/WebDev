package secondWeek;

public class Grade01 { // 성적 등급표 만들기

	public static void main(String[] args) {
		int kor = 80;
		int mat = 80;
		int eng = 60;
		int sum = kor + mat + eng;
		double avg = (double)sum / 3;
		
		System.out.print("당신의 점수는 " + Math.round(avg) + "점이고, ");
		if (avg >= 90) {
			System.out.println("등급은 수 입니다.");
		} else if (avg >= 80) {
			System.out.println("등급은 우 입니다.");
		} else if (avg >= 70) {
			System.out.println("등급은 미 입니다.");
		} else if (avg >= 60) {
			System.out.println("등급은 양 입니다.");
		} else {
			System.out.println("등급은 가 입니다.");
		}
	}
}