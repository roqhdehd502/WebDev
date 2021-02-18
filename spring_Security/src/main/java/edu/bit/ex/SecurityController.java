package edu.bit.ex;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/security/*")
public class SecurityController {
	@GetMapping("/all")
	public void doAll() {
		log.info("do all can access everybody");
	}

	@GetMapping("/member")
	public void doMember() {
		log.info("logined member");
	}

	@GetMapping("/admin")
	public void doAdmin() {
		log.info("admin only");
	}

	// 에러 페이지
	@GetMapping("/accessError")
	public void accessError(Authentication auth, Model model) {
		log.info("Accessed Denied" + auth);
		// Authentication 객체에 의해 접근 거부 메시지를 날린다.
		model.addAttribute("msg", "Accessed Denied");
	}
}