package com.okhospital.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.okhospital.dao.BoardDAO;
import com.okhospital.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
	
	// 다오를 호출해서 써먹을 수 있다.
	@Autowired
	BoardDAO boardDao;
	
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return boardDao.boardList();
	}

	@Override
	public BoardDTO boardRead(int seq) throws Exception {
		return boardDao.boardRead(seq);
	}

	@Override
	public void boardWrite(BoardDTO dto) throws Exception {
		boardDao.boardWrite(dto);
		
	}

	@Override
	public void boardUpdate(BoardDTO dto) throws Exception {
		boardDao.boardUpdate(dto);
		
	}

	@Override
	public void boardDelete(int seq) throws Exception {
		boardDao.boardDelete(seq);
		
	}
	
}
