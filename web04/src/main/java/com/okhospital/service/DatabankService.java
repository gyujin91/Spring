package com.okhospital.service;

import java.util.List;

import com.okhospital.dto.DatabankDTO;

public interface DatabankService {
	
	// 자료실 목록 불러오기
	public List <DatabankDTO> dataList() throws Exception;
	
	// 자료 상세보기
	public DatabankDTO dataRead(int rno) throws Exception;
	
	// 자료실 글 쓰기
	public void dataWrite(DatabankDTO dto) throws Exception;
	
	// 자료실 글 수정
	public void dataUpdate(DatabankDTO dto) throws Exception;
	
	// 자료실 글 삭제
	public void dataDelete(int rno) throws Exception;
}
