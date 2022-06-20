package com.okhospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.okhospital.dao.MemberDAO;
import com.okhospital.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{

	// 객체 주입
	@Autowired
	MemberDAO memberDao;
	
	@Override
	public List<MemberDTO> memberList() throws Exception {
		return memberDao.memberList();
	}

	@Override
	public MemberDTO memberRead(String userid) throws Exception {
		return memberDao.memberRead(userid);
	}

	@Override
	public void join(MemberDTO dto) throws Exception {
		memberDao.join(dto);
	}

	@Override
	public void memberUpdate(MemberDTO dto) throws Exception {
		memberDao.memberUpdate(dto);
	}

	@Override
	public void memberDelete(String userid) throws Exception {
		memberDao.memberDelete(userid);
	}

	@Override
	public MemberDTO login(String userid, String userpw) throws Exception {
		return memberDao.login(userid, userpw);
	}

	@Override
	public int idCheck(String userid) throws Exception {
		return memberDao.idCheck(userid);
	}
	
}
