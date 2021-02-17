package edu.bit.ex.emp.vo;

import java.util.List;

/*
DEPT 테이블
=========
DEPTNO    NUMBER(2)    
DNAME     VARCHAR2(14) 
LOC       VARCHAR2(13)
*/

public class DeptVO {
	private int deptno; // 부서번호
	private String dname; // 부서명
	private String loc; // 부서위치

	private List<EmpVO> empVO; // 직원 테이블 참조(1 : N의 관계)

	public DeptVO() {
		super();
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

	public List<EmpVO> getEmpVO() {
		return empVO;
	}

	public void setEmpVO(List<EmpVO> empVO) {
		this.empVO = empVO;
	}
}