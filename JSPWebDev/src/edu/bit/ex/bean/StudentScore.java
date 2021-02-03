package edu.bit.ex.bean;

public class StudentScore {
	private String classNum; // 학번
	private String javaScore; // 자바 점수
	private String dbScore; // 데이터베이스 점수
	private String jspScore; // JSP 점수
	
	public StudentScore() { }

	public String getClassNum() {
		return classNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

	public String getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(String javaScore) {
		this.javaScore = javaScore;
	}

	public String getDbScore() {
		return dbScore;
	}

	public void setDbScore(String dbScore) {
		this.dbScore = dbScore;
	}

	public String getJspScore() {
		return jspScore;
	}

	public void setJspScore(String jspScore) {
		this.jspScore = jspScore;
	}
	
	public double getAvg(String javaScore, String dbScore, String jspScore) {
		int tempJava = Integer.parseInt(javaScore);
		int tempDb = Integer.parseInt(dbScore);
		int tempJsp = Integer.parseInt(jspScore);
		
		return Math.round(((tempJava + tempDb + tempJsp) / 3)*10)/10.0;
	}
}