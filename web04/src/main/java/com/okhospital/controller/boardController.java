package com.okhospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;

import com.okhospital.dto.BoardDTO;
import com.okhospital.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	//private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	//다음 서비스 작업 객체를 주입
	@Autowired
	BoardService boardService;
	
	// 게시판 목록 보기
	@RequestMapping("list.do")
	public String boardList(Model model) throws Exception {
		List<BoardDTO> boardList = boardService.boardList();
		model.addAttribute("boardList", boardList);
		return "board/boardList";
	}

// 구형 ModelAndView 방식
//	public ModelAndView boardList() throws Exception {
//		List<BoardDTO> boardList = boardService.boardList();
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("board/boardList");
//		mav.addObject("boardList", boardList);
//		return mav;
//	}
	
	// 게시판 글 상세보기
	@RequestMapping(value="read.do", method = RequestMethod.GET)
	public String boardRead(@RequestParam int seq, Model model) throws Exception {
		BoardDTO board = boardService.boardRead(seq);
		model.addAttribute("board", board);
		return "board/boardRead";
	}

	// 글 쓰기 화면
	@RequestMapping("writeForm.do")  //board/write_form  -> board/boardWriteForm.jsp
	public String boardWriteForm(Model model) throws Exception {
		return "board/boardWriteForm";
	}
	
	// 글 쓰기 처리
	@RequestMapping(value="write.do", method = RequestMethod.POST)
	public String boardWrite(BoardDTO dto, Model model) throws Exception {
		boardService.boardWrite(dto);
		return "redirect:list.do";
	}
	
	// 글 수정
	@RequestMapping(value="update.do", method = RequestMethod.POST)
	public String boardUpdate(BoardDTO dto, Model model) throws Exception {
		boardService.boardUpdate(dto);
		return "redirect:list.do";
	}

	// 글 삭제
	@RequestMapping(value="delete.do", method = RequestMethod.GET)
	public String boardDelete(@RequestParam int seq, Model model) throws Exception {
		boardService.boardDelete(seq);
		return "redirect:list.do";
	}
}