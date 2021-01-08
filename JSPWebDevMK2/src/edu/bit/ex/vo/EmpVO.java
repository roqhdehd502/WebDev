package edu.bit.ex.vo;

import java.security.Timestamp;

public class EmpVO {
	private String ename;
	private int empno;
	private Timestamp date;
	private String job;

	public EmpVO(){

	}

	public EmpVO(String name, int empno, String job) {
		this.ename = name;
		this.empno = empno;
		this.job = job;
	}

	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getEmpno() {
		return empno;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public Timestamp getDate() {
		return date;
	}
	
	public void setDate(Timestamp date) {
		this.date = date;
	}   
}