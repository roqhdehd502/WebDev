package edu.bit.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.dao.Dao;

public class WriteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bName = request.getParameter("bName");
	    String bTitle = request.getParameter("bTitle");
	    String bContent = request.getParameter("bContent");
	      
	    Dao dao = new Dao();
	    dao.write(bName, bTitle, bContent);
	}
}