package com.okhospital.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.okhospital.dto.MemberDTO;
import com.okhospital.service.MemberService;

@Controller
public class memberController {
	private static final Logger logger = LoggerFactory.getLogger(memberController.class);
	
	// 객체 주입
	@Autowired
	MemberService memberService;
	
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
	
	// 회원 가입
	@RequestMapping(value = "join.do", method = RequestMethod.POST)
	public String join(MemberDTO dto, Model model) throws Exception {
		memberService.join(dto);
		return "redirect:list.do";
	}
	
	// 회원 정보 변경
	@RequestMapping(value = "update.do", method = RequestMethod.POST)
	public String memberUpdate(MemberDTO dto, Model model) throws Exception {
		memberService.memberUpdate(dto);
		return "redirect:list.do";
	}
	
	// 회원 탈퇴
	@RequestMapping(value = "delte.do", method = RequestMethod.GET)
	public String memberDelte(@RequestParam String userid, Model model, HttpSession session) throws Exception {
		memberService.memberDelete(userid);
		return "redirect:list.do";
	}
		
	// 로그인
	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login(@RequestParam String userid, String userpw, HttpSession session, Model model, RedirectAttributes rttr) throws Exception {
		MemberDTO dto = memberService.login(userid, userpw);
		if(dto == null) {
			// 로그인 실패
			session.setAttribute("member", null);
			model.addAttribute("msg", "로그인 실패");
			rttr.addFlashAttribute("message", "로그인 실패");
			return "redirect:login.do";
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
	@RequestMapping("logOut.do")
	public String logOut(HttpSession session) throws Exception {
		session.invalidate();
		// 홈으로 가라
		return "redirect:/";
	}
	
	
}
