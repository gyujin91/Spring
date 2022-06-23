package com.okhospital.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.okhospital.dto.MemberDTO;
import com.okhospital.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class memberController {
	private static final Logger logger = LoggerFactory.getLogger(memberController.class);
	
	// 객체 주입
	@Autowired
	MemberService memberService;
	
	// 세션처리를 위한 객체 주입
	@Autowired
	HttpSession session;
	
	// 비밀번호 암호화를 위한 객체 주입
	@Autowired
	BCryptPasswordEncoder pwdEncoder;
	
	// 회원 목록 보기
	@RequestMapping("list.do")
	public String memberList(Model model) throws Exception {	
		List<MemberDTO> memberList = memberService.memberList();
		model.addAttribute("memberList",memberList);
		return "member/memberList";
	}
	
	// 회원 정보 상세 보기
	@RequestMapping(value = "read.do", method = RequestMethod.GET)
	public String memberRead(@RequestParam String userid, Model model) throws Exception {
		MemberDTO member = new MemberDTO();
		model.addAttribute("member", member);
		return "member/memberRead";
		
	}
	
	// 약관 동의 폼
	@RequestMapping("agreement.do")
	public String agreement(Model model) throws Exception { 
		return "member/agreement"; 
	}
	
	
	// 회원 가입 폼
	@RequestMapping("joinForm.do")
	public String joinForm(Model model) throws Exception {
			return "member/joinForm";
	}
	
	// 회원 가입 처리
	@RequestMapping(value = "join.do", method = RequestMethod.POST)
	public String join(MemberDTO dto, Model model) throws Exception {
		// 패스워드 암호화
		String userpw = dto.getUserpw();
		String pwd = pwdEncoder.encode(userpw);
		dto.setUserpw(pwd);
		memberService.join(dto);
		return "redirect:login.do";
	}
	
	// 회원 정보 변경
	@RequestMapping(value = "update.do", method = RequestMethod.POST)
	public String memberUpdate(MemberDTO dto, Model model) throws Exception {
		memberService.memberUpdate(dto);
		return "redirect:/";
	}
	
	// 회원 탈퇴
	@RequestMapping(value = "delte.do", method = RequestMethod.GET)
	public String memberDelte(@RequestParam String userid, Model model, HttpSession session) throws Exception {
		memberService.memberDelte(userid);
		return "redirect:/";
	}
	
	@RequestMapping("loginForm.do")
	public String loginForm(Model model) throws Exception {
		return "member/loginForm";
	}
	
	// 로그인
	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login(@RequestParam String userid, String userpw, Model model, RedirectAttributes rttr) throws Exception {
		MemberDTO dto = memberService.login(userid, userpw);
		if(dto == null) {
			// 로그인 실패
			session.setAttribute("member", null);
			model.addAttribute("msg", "로그인 실패");
			rttr.addFlashAttribute("message", "로그인 실패");
			return "redirect:loginForm.do";
		} else {
			// 로그인 성공
			session.setAttribute("member", dto);
			// 홈으로 가라
			return "redirect:/";
		}
	}
	
	// 아이디 중복 체크
	@RequestMapping("idCheck.do")
	public int idCheck(@RequestParam String userid) throws Exception {
		int result = memberService.idCheck(userid);
		return result;	
	}
	
	// 로그 아웃
	@RequestMapping("logout.do")
	public String logOut(HttpSession session) throws Exception {
		if(session != null) {
			session.invalidate();
		}
		// 홈으로 가라
		return "redirect:/";
	}
	
	
}
