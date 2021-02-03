package edu.bit.ex.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@Log4j

/*
 * MockMvc란? 실제 객체와 비슷하지만 테스트에 필요한 기능만 가지는 가짜 객체를 만들어서 애플리케이션 서버에 배포하지 않고도 스프링 MVC 동작을 재현할 수 있는 클래스를 의미.
 */

public class BoardControllerTest {
	@Setter(onMethod_ = { @Autowired })
	private WebApplicationContext ctx;
	private MockMvc mockMvc;

	// 테스트 초기화
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	/*
	 * // List 페이지 목업 테스트
	 * 
	 * @Test public void testList() throws Exception { mockMvc.perform(get("/board/list")) // list 매핑 경로 가져오기 .andExpect(status().isOk()) // 응답 검증
	 * .andDo(print()) // 검증이 완료되면 print .andExpect(forwardedUrl("/WEB-INF/views/board/list.jsp")); // 해당 URL을 포워딩한다. }
	 */

	// Content View 페이지 목업 테스트

	@Test
	public void testContentView() throws Exception {
		mockMvc.perform(get("/board/content_view")) // content_view 매핑 경로 가져오기
				.andExpect(status().isOk()) // list 매핑 경로 가져오기 .andExpect(status().isOk()) // 응답 검증 .andDo(print()) // 검증이 완료되면 print
				.andExpect(forwardedUrl("/WEB-INF/views/board/content_view.jsp")); // 해당 URL을 포워딩한다. }
	}
}