package com.okhospital.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.okhospital.dto.DatabankDTO;

@Repository
public class DatabankDAOImpl implements DatabankDAO {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<DatabankDTO> dataList() throws Exception {
		return sqlSession.selectList("databank.dataList");
	}

	@Override
	public DatabankDTO dataRead(int rno) throws Exception {
		return sqlSession.selectOne("databank.dataRead", rno);
	}

	@Override
	public void dataWrite(DatabankDTO dto) throws Exception {
		sqlSession.insert("databank.dataWrite", dto);
	}

	@Override
	public void dataUpdate(DatabankDTO dto) throws Exception {
		sqlSession.update("dtabank.dataUpdate", dto);
	}

	@Override
	public void dataDelete(int rno) throws Exception {
		sqlSession.delete("databank.dataDelete", rno);
	}

	
}
