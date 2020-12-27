package secondWeek.rec;

public class Grade02 {
	private int kor, eng, mat;
	
	public Grade02(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public double getAvg() {
		return (double)(kor + eng + mat) / 3.0;
	}

	public void show() {
		System.out.print("당신의 성적은 " + Math.round(getAvg()) + "점 이고, ");
		if (getAvg() >= 90) {
			System.out.println("등급은 수 입니다.");
		} else if (getAvg() >= 80) {
			System.out.println("등급은 우 입니다.");
		} else if (getAvg() >= 70) {
			System.out.println("등급은 미 입니다.");
		} else if (getAvg() >= 60) {
			System.out.println("등급은 양 입니다.");
		} else {
			System.out.println("등급은 가 입니다.");
		}
	}
}