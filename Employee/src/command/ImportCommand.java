package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Dto;

public class ImportCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Dao dao= new Dao();
		
		ArrayList<Dto> mgrList = dao.mgrList();
		ArrayList<Dto> deptList = dao.deptList();
		ArrayList<Dto> locList = dao.locList();
		
		request.setAttribute("mgrList", mgrList);
		request.setAttribute("deptList", deptList);
		request.setAttribute("locList", locList);
	}
}