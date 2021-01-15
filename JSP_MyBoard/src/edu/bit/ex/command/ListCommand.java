package edu.bit.ex.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.dao.Dao;
import edu.bit.ex.dto.Dto;

public class ListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Dao dao = new Dao();
		ArrayList<Dto> list = dao.list();
		request.setAttribute("list", list);
	}
}