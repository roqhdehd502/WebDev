package edu.bit.ex.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.bit.ex.board.service.LoginService;
import edu.bit.ex.board.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
public class LoginController {
	private LoginService loginService;
	/* private KakaoService kakaoService; */

	// 루트 페이지 매핑(home 컨트롤러 매핑 구현 주석처리 할 것
	@GetMapping("/")
	public String home() {
		log.info("home...");
		return "log/login";
	}

	// 로그인 페이지
	@PostMapping("/login")
	public String login(HttpServletRequest req, RedirectAttributes rttr) {
		log.info("post login..");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");

		// Session 처리를 위한 Session 객체 HttpServletRequest 안에 있음
		HttpSession session = req.getSession();

		UserVO user = loginService.loginUser(id, pw);

		if (user == null) {
			session.setAttribute("user", null);
			/*
			 * Spring3 에서 제공하는 RedirectAttributes를 사용하면 redirect post 구현이 가능하다. 하지만 일회성이라 새로고침하면 날라가는 데이터이므로 사용목적에 따라서 판단 후 사용한다.
			 */
			rttr.addFlashAttribute("msg", false);
		} else {
			session.setAttribute("user", user);
		}

		return "redirect:/";
	}

	/*
	 * // 카카오 로그인 페이지
	 * 
	 * @RequestMapping("/kakao_login") public String kakao_login(@RequestParam(value = "code", required = false) String code) throws Exception { //
	 * HttpSession session = req.getSession();
	 * 
	 * System.out.println("#########" + code); String access_Token = kakaoService.getAccessToken(code); HashMap<String, Object> userInfo =
	 * kakaoService.getUserInfo(access_Token);
	 * 
	 * System.out.println("###access_Token#### : " + access_Token); System.out.println("###userInfo#### : " + userInfo.get("email"));
	 * System.out.println("###nickname#### : " + userInfo.get("nickname")); System.out.println("###profile_image#### : " +
	 * userInfo.get("profile_image"));
	 * 
	 * // session.setAttribute("user", userInfo.get("nickname"));
	 * 
	 * return "log/kakao_access"; }
	 */

	// 로그아웃
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) throws Exception {
		log.info("/member/logout");
		session.invalidate();

		return "redirect:/";
	}
}