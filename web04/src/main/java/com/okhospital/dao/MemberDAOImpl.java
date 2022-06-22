package com.okhospital.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.okhospital.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	// 객체 주입
	@Autowired
	SqlSession sqlSession;
	
	@Override
	// 회원 목록 보기
	public List<MemberDTO> memberList() throws Exception {
		return sqlSession.selectList("member.memberList");
	}

	@Override
	// 회원 상세 보기
	public MemberDTO memberRead(String userid) throws Exception {
		return sqlSession.selectOne("member.memberRead", userid);
	}

	@Override
	// 회원 가입
	public void join(MemberDTO dto) throws Exception {
		sqlSession.insert("member.join", dto);
	}

	@Override
	// 회원 정보 수정
	public void memberUpdate(MemberDTO dto) throws Exception {
		sqlSession.update("member.memberUpdate", dto);
	}

	@Override
	// 회원 탈퇴
	public void memberDelte(String userid) throws Exception {
		sqlSession.delete("member.memberDelete", userid);
	}

	@Override
	// 로그인
	public MemberDTO login(String userid, String userpw) throws Exception {
		MemberDTO dto = new MemberDTO();
		HashMap<String, String> map = new HashMap<>();
		map.put("userid", userid);
		map.put("userpw", userpw);
		dto = sqlSession.selectOne("member.login", map);
		return dto;
	}

	@Override
	// 아이디 중복 체크
	public int idCheck(String userid) throws Exception {
		return sqlSession.selectOne("member.idCheck", userid);
	}
	
}
