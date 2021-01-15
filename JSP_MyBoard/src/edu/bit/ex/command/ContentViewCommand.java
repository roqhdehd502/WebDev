package edu.bit.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.dao.Dao;
import edu.bit.ex.dto.Dto;

public class ContentViewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bId = request.getParameter("bId");
		
		Dao dao = new Dao();
		Dto contentView = dao.contentView(bId);
		
		request.setAttribute("contentView", contentView);
	}
}