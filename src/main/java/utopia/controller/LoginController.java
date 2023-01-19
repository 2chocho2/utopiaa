package utopia.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import utopia.dto.LoginDto;
import utopia.dto.MemberDto;
import utopia.dto.PerfumeDto;
import utopia.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	@GetMapping("/login.do")
	public String login(HttpSession session) throws Exception {
		if (session.getAttribute("memberEmail") == null) {
			return "login.html";
		} else {
			return "main.html";
		}
	}

	@PostMapping("/login.do")
	public String login(LoginDto loginDto, HttpSession session) throws Exception {

		MemberDto memberDto = loginService.login(loginDto);
		if (memberDto == null) {
			session.setAttribute("message", "일치하는 정보가 존재하지 않습니다.");

			return "redirect:/login.do";
		} else {
			session.setAttribute("member", memberDto);
			return "redirect:/main.do";
		}
	}

	@GetMapping("/logout.do")
	public String logout(HttpSession session) throws Exception {
		session.removeAttribute("member");
		session.invalidate();
		return "redirect:/login.do";
	}

	@RequestMapping("/openSignup.do")
	public String openSignup() throws Exception {
		return "signup.html";
	}

	@RequestMapping("/memberInsert.do")
	public String memberInsert(MemberDto memberDto) throws Exception {
		loginService.memberInsert(memberDto);
		return "redirect:/login.do";
	}

	@GetMapping("/main.do")
	public ModelAndView openMain() throws Exception {
		ModelAndView mv = new ModelAndView("/main");
		List<PerfumeDto> bestList = loginService.selectPerfumeBest();
		mv.addObject("bestList", bestList);
		return mv;
	}


}