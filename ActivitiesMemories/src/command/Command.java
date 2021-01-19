package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	abstract void execute(HttpServletRequest request, HttpServletResponse response);
}