package edu.bit.ex.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.dao.DAO;
import edu.bit.ex.dto.DTO;

public class EmpListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		DAO dao = new DAO();
		
		ArrayList<DTO> jobList = dao.jobList();
		request.setAttribute("jobList", jobList);
		
		ArrayList<DTO> mgrList = dao.mgrList();
		request.setAttribute("mgrList", mgrList);
		
		ArrayList<DTO> deptList = dao.deptList();
		request.setAttribute("deptList", deptList);
	}
}