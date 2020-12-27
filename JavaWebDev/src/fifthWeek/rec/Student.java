package fifthWeek.rec;

public class Student {
	private String name;
	private String dept;
	private int classNum;
	private double grdAvg;
	
	public Student() {}
	
	public Student(String name, String dept,
			int classNum, double grdAvg) {
		this.name = name;
		this.dept = dept;
		this.classNum = classNum;
		this.grdAvg = grdAvg;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public double getGrdAvg() {
		return grdAvg;
	}

	public void setGrdAvg(double grdAvg) {
		this.grdAvg = grdAvg;
	}

	@Override
	public String toString() {
		return "이름: " + name + "\n"
				+ "학과: " + dept + "\n"
				+ "학번: " + classNum + "\n"
				+ "학점평균: " + grdAvg + "\n"
				+ "----------------------------------";
	}
}