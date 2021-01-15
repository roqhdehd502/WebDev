package dto;

import java.sql.Timestamp;

/*
EMP 테이블
=========
EMPNO       NUMBER(4)    
ENAME       VARCHAR2(10) 
JOB         VARCHAR2(9)  
MGR         NUMBER(4)    
HIREDATE    DATE         
SAL         NUMBER(7,2)  
COMM        NUMBER(7,2)  
DEPTNO      NUMBER(2)  

DEPT 테이블
=========
DEPTNO    NUMBER(2)    
DNAME     VARCHAR2(14) 
LOC       VARCHAR2(13) 
*/

public class Dto {
	private int empno; // EMP
	private String ename; // EMP
	private String job; // EMP
	private int mgr; // EMP
	private Timestamp hiredate; // EMP
	private int sal; // EMP
	private int comm; // EMP
	private int deptno; // EMP, DEPT
	private String dname; // DEPT
	private String loc; // DEPT
	
	private String date; // Insert용 hiredate DAO에서 변환한다
	
	public Dto() { }
	
	public Dto(String loc) {
		super();
		this.loc = loc;
	}
	
	public Dto(int no, String name) {
		super();
		this.empno = no;
		this.ename = name;
		this.deptno = no;
		this.dname = name;
	}

	public Dto(int empno, String ename, String job,
			int mgr, Timestamp hiredate, int sal,
			int comm, int deptno, String dname, String loc) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

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

	public Timestamp getHiredate() {
		return hiredate;
	}

	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}