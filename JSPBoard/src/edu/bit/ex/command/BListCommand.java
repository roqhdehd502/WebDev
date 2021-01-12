package edu.bit.ex.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.dao.BDao;
import edu.bit.ex.dto.BDto;

public class BListCommand implements BCommand { // 커맨드 리스트 객체
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BDao dao = new BDao();
		
		ArrayList<BDto> dtos = dao.list(); // 리스트로 담은 DB 내용을
		request.setAttribute("list", dtos); // request 객체에 list란 이름으로 담는다.
	}
}