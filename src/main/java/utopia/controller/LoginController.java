package utopia.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import utopia.dto.LoginDto;
import utopia.dto.MemberDto;
import utopia.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@GetMapping("utopia/login.do")
	public String login(HttpSession session) throws Exception {
		if (session.getAttribute("memberEmail") == null) {
			return "login.html";
		}else {
			return "redirect:/perfumeList.do";
		}
	}
	
	
	@PostMapping("utopia/login.do")
	public String login(LoginDto loginDto, HttpSession session) throws Exception {
		
		MemberDto memberDto = loginService.login(loginDto);
		if(memberDto == null) {
			session.setAttribute("message", "일치하는 정보가 존재하지 않습니다.");
			
			return "redirect:/login.do";
		}else {
			session.setAttribute("member", memberDto);
			return "redirect:/perfumeList.do";
		}
	}
	
	@RequestMapping("/utopia/openSignup.do")
	public String openSignup() throws Exception{
		return "signup.html";
	}
	
	@RequestMapping("/utopia/memberInsert.do")
	public String memberInsert(MemberDto memberDto) throws Exception {
		loginService.memberInsert(memberDto);
		return "redirect:/utopia/login.do";	
	}
		
	
}
	

