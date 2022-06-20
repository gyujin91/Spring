package com.okhospital.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.okhospital.dto.BoardDTO;

@Repository	// 현재 클래스를 dao bean으로 등록
public class BoardDAOImpl implements BoardDAO {

	// 추상 클래스 상속(implements) 후 오버라이딩
	// 해당 프로그램이 필요하면 알아서 사용하게 되어 스스로 제어하게 됨
	//  -> IoC(Inverse of Controller) 제어의 역전
	// 객체 주입  - @Autowired 나 @Inject 둘중 하나 사용
	
	@Autowired
	SqlSession sqlSession;
	// boardMapper.mxl의 내용을 include한 것과 같은 효과가 있음
	
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return sqlSession.selectList("board.boardList");
	}

	@Override
	public BoardDTO boardRead(int seq) throws Exception {
		return sqlSession.selectOne("board.boardRead", seq);
	}

	@Override
	public void boardWrite(BoardDTO dto) throws Exception {
		sqlSession.insert("board.boardWrite", dto);
	}

	@Override
	public void boardUpdate(BoardDTO dto) throws Exception {
		sqlSession.update("board.boardUpdate", dto);
	}

	@Override
	public void boardDelete(int seq) throws Exception {
		sqlSession.delete("board.boardDelete", seq);
	}
	
	
	
}
