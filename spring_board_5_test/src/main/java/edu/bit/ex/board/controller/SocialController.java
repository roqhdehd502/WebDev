package edu.bit.ex.board.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.scribejava.core.model.OAuth2AccessToken;

import edu.bit.ex.board.service.KakaoService;
import edu.bit.ex.board.service.NaverLoginBO;
import edu.bit.ex.board.vo.kakao.KakaoAuth;
import edu.bit.ex.board.vo.kakao.KakaoProfile;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
public class SocialController {
	private KakaoService kakaoService;
	private NaverLoginBO naverLoginBO;

	@Autowired
	private void setNaverLoginBO(NaverLoginBO naverLoginBO) {
		this.naverLoginBO = naverLoginBO;
	}

	@GetMapping("/social")
	public String home(Model model, HttpSession session) {
		log.info("social..");

		model.addAttribute("kakaoUrl", kakaoService.getAuthorizationUrl());
		model.addAttribute("naverUrl", naverLoginBO.getAuthorizationUrl(session));

		return "social/login";
	}

	@GetMapping("/auth/kakao/callback")
	public String kakaoCallback(String code, Model model) {
		log.info("kakaoCallback ..");

		KakaoAuth kakaoAuth = kakaoService.getKakaoTokenInfo(code);
		KakaoProfile profile = kakaoService.getKakaoProfile(kakaoAuth.getAccess_token());

		model.addAttribute("user", profile);

		return "social/social_home";
	}

	@GetMapping("/auth/naver/callback")
	public String NaverCallback(String code, String state, Model model, HttpSession session) throws IOException, ParseException {
		log.info("NaverCallback ..");

		OAuth2AccessToken oauthToken = naverLoginBO.getAccessToken(session, code, state);
		String apiResult = naverLoginBO.getUserProfile(oauthToken); // String형식의 json데이터

		JSONParser parser = new JSONParser();
		Object obj = parser.parse(apiResult);
		JSONObject jsonObj = (JSONObject) obj;

		// Top레벨 단계 _response 파싱
		JSONObject response_obj = (JSONObject) jsonObj.get("response");
		// response의 nickname값 파싱
		String nickname = (String) response_obj.get("nickname");
		log.info(nickname);

		// 로그인 사용자 정보를 읽어온다.
		model.addAttribute("naverID", nickname);
		/* model.addAttribute("result", apiResult); */

		return "social/social_home";
	}

	// 로그아웃
	/*
	 * @RequestMapping(value = "/logout") public String logout(HttpSession session) throws Exception { log.info("/logout"); session.invalidate();
	 * 
	 * return "redirect:/"; }
	 */
}