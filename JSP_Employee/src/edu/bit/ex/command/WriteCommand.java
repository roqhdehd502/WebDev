package edu.bit.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.dao.DAO;

public class WriteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String empno = request.getParameter("empno");
	    String ename = request.getParameter("ename");
	    String job = request.getParameter("job");
	    String mgr = request.getParameter("mgr");
	    String hiredate = request.getParameter("hiredate");
	    String sal = request.getParameter("sal");
	    String comm = request.getParameter("comm");
	    String deptno = request.getParameter("deptno");
	    
	    DAO dao = new DAO();
	    dao.write(empno, ename, job, mgr, 
	    		hiredate, sal, comm, deptno);
	}
}