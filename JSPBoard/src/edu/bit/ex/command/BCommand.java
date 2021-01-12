package edu.bit.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCommand { // 커맨드 인터페이스
	abstract void execute(HttpServletRequest request, HttpServletResponse response);
}