package com.okhospital.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.okhospital.dto.BoardDTO;

// 바인딩된 저장소 - mapper라고 알려줌
@Repository
public class BoardDAOImpl implements BoardDAO {
	
	// 해당 프로그램이 필요하면 알아서 사용하게 되어 스스로 제어하게 됨 
	// -> IoC(Inverse of Controll : 제어 역전)
	// inject - Mapper의 도구들을 던져줌 (객체주입)
	@Inject // @Autowired 둘중 하나 쓰면됨
	SqlSession sqlSession; // 얘가 mybatis
	
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return sqlSession.selectList("board.boardList");
	}

	@Override
	public BoardDTO boardRead(int seq) throws Exception {
		return sqlSession.selectOne("board.boardRead", seq);	// 데이터가 한건이면 one
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
