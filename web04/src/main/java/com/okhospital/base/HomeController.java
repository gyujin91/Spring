package com.okhospital.base;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.okhospital.dto.MemberDTO;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		// console창에 메시지를 띄움
		logger.info("테스트 페이지~!");
		model.addAttribute("msg", "테스트 페이지 입니다.");
		return "test";
	}
	
	@RequestMapping(value = "test/doA", method = RequestMethod.GET)
	public String doA(Locale locale, Model model) {
		logger.info("doA 테스트 페이지~!");
		model.addAttribute("msg", "doA 테스트 페이지");
		return "/test/doA";
	}
	
	@RequestMapping(value = "test/doB", method = RequestMethod.GET)
	public ModelAndView doB(Locale locale, Model model) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("test2", 999);
		map.put("test1", 888);
		logger.info("doB 테스트 페이지~!");
		model.addAttribute("msg", "doB 테스트 페이지");
		return new ModelAndView("/test/doB", "map", map);
	}
	
	@RequestMapping(value = "test/doC", method = RequestMethod.GET) 
	public ModelAndView doC(Locale locale, Model model) {
		ArrayList<MemberDTO> list = new ArrayList<>(); 
		MemberDTO dto1 = new MemberDTO();
		dto1.setUserid("siri");
		dto1.setUserpw("1234");
		dto1.setUsername("이쁜이");
		list.add(dto1);
		MemberDTO dto2 = new MemberDTO();
		dto2.setUserid("heeya");
		dto2.setUserpw("2345");
		dto2.setUsername("희야");
		list.add(dto2);
		MemberDTO dto3 = new MemberDTO();
		dto3.setUserid("daly");
		dto3.setUserpw("1111");
		dto3.setUsername("달리");
		list.add(dto3);
		logger.info("doC 테스트 페이지~!");
		model.addAttribute("msg", "doC 테스트 페이지");
		return new ModelAndView("/test/doC", "list", list);
	}
		
	@RequestMapping(value ="test/doD", method = RequestMethod.GET) 
		public String doD(Locale locale, Model model) {
		MemberDTO member = new MemberDTO();
		member.setUserid("lgj");
		member.setUserpw("1004");
		//해당 url로 자동포워딩 후 이동됨
		return "redirect:/test/doD";
	}
}
