package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;

public class CheckCommand implements Command {
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
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
	      
	    Dao dao = new Dao();
	    dao.empWrite(empno, ename, job, mgr, hiredate,
	    		sal, comm);
	    dao.deptWrite(deptno, dname, loc);		
	}
}