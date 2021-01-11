package ex.humanAffair;

import java.sql.Timestamp;

public class EmpDTO {
	private int empno; // 사원번호(EMP)
	private String ename; // 사원이름(EMP)
	private String job; // 사원직급(EMP)
	private int mgr; // 상사(EMP)
	private Timestamp rDate; // 입사일(EMP)
	private int sal; // 급여(EMP)
	private	int comm; // 커미션(EMP)
	private int deptno; // 부서번호(EMP, DEPT)
	private String dname; // 부서이름(DEPT)
	private String loc; // 부서위치(DEPT)
	
	public EmpDTO() { }
	
	/*
	public EmpDTO(int empno, String ename, String job,
			int mgr, Timestamp rDate, int sal,
			int comm, int deptno, String dname, String loc) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.rDate = rDate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	*/

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Timestamp getrDate() {
		return rDate;
	}

	public void setrDate(Timestamp rDate) {
		this.rDate = rDate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
}