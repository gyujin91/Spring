package com.okhospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.okhospital.dao.MemberDAO;
import com.okhospital.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	// 객체 주입
	@Autowired
	MemberDAO memberDao;
	
	@Override
	// 회원 목록 보기
	public List<MemberDTO> memberList() throws Exception {
		return memberDao.memberList();
	}
	
	@Override
	// 회원 상세 보기
	public MemberDTO memberRead(String userid) throws Exception {
		return memberDao.memberRead(userid);
	}

	@Override
	// 회원가입
	public void join(MemberDTO dto) throws Exception {
		memberDao.join(dto);
	}

	@Override
	// 회원 정보 수정
	public void memberUpdate(MemberDTO dto) throws Exception {
		memberDao.memberUpdate(dto);
	}

	@Override
	// 회원 탈퇴
	public void memberDelte(String userid) throws Exception {		
		memberDao.memberDelte(userid);
	}

	@Override
	// 로그인
	public MemberDTO login(String userid, String userpw) throws Exception {
		return memberDao.login(userid, userpw);
	}

	@Override
	// 아이디 중복 체크
	public int idCheck(String userid) throws Exception {
		return memberDao.idCheck(userid);
	}

}
