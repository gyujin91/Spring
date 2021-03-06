package com.okhospital.service;

import java.util.List;

import com.okhospital.dto.MemberDTO;

public interface MemberService {
		// 회원 목록
		public List<MemberDTO> memberList() throws Exception;
		// 회원 정보 상세보기
		public MemberDTO memberRead(String userid) throws Exception;
		// 회원 가입
		public void join(MemberDTO dto) throws Exception;
		// 회원 정보 변경
		public void memberUpdate(MemberDTO dto) throws Exception;
		// 회원 탈퇴
		public  void memberDelte(String userid) throws Exception;
		// 로그인
		public MemberDTO login(String userid, String userpw) throws Exception;
		// 아이디 존재 유무 체크
		public int idCheck(String userid) throws Exception;
}
