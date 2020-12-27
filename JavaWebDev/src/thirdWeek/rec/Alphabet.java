package thirdWeek.rec;

public class Alphabet {
	private char[] eng = new char[26];

	public Alphabet() { 

	}

	public Alphabet(char[] eng) { 
		this.eng = eng;
	}

	public char[] getEng() {
		return eng;
	}

	public void setEng(char[] eng) {
		this.eng = eng;
	}
	
	private void getAlpha() {
		for (int i = 0; i < eng.length; i++) {
			eng[i] = (char)(65 + i); // 'A'의 ASCII 코드인 65 인코딩 
		}
	}

	public void user() {
		getAlpha();
		for (int i = 0; i < eng.length; i++) {
			System.out.print(eng[i] + " ");
		}
		System.out.println();
	}
}