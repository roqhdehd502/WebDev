package secondWeek.rec;

public class Grade {
	private int kor, eng, mat;

	public Grade(int kor, int eng, int mat) {
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
	
	private double getAvg() {
		return (double)(kor + eng + mat) / 3.0;
	}
	
	public char getGrade() {
		char getChar = 0;
		System.out.print("당신의 평균은 " + Math.round(getAvg()) + "점 이고, 등급은 ");
		
		if (getAvg() >= 90) {
			getChar = '수';
		} else if (getAvg() >= 80) {
			getChar = '우';
		} else if (getAvg() >= 70) {
			getChar = '미';
		} else if (getAvg() >= 60) {
			getChar = '양';
		} else {
			getChar = '가';
		}
		
		return getChar;
	}
}