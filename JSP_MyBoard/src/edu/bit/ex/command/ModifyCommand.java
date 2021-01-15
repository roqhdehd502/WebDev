package edu.bit.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.dao.Dao;
import edu.bit.ex.dto.Dto;

public class ModifyCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {	
		String bId = request.getParameter("bId"); 
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle"); 
		String bContent = request.getParameter("bContent");
		
		Dao dao = new Dao();
		dao.dodify(bId, bName, bTitle, bContent);
	}
}