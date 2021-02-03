package edu.bit.ex.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.dao.DAO;
import edu.bit.ex.dto.DTO;

public class ListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		DAO dao = new DAO();
		ArrayList<DTO> list = dao.list();
		request.setAttribute("list", list);
		
	}
}