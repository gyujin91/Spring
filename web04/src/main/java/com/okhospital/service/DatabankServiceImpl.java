package com.okhospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.okhospital.dao.DatabankDAO;
import com.okhospital.dto.DatabankDTO;

@Service
public class DatabankServiceImpl implements DatabankService{

	@Autowired
	DatabankDAO databankDao;
	
	@Override
	public List<DatabankDTO> dataList() throws Exception {
		return databankDao.dataList();
	}

	@Override
	public DatabankDTO dataRead(int rno) throws Exception {
		return databankDao.dataRead(rno);
	}

	@Override
	public void dataWrite(DatabankDTO dto) throws Exception {
		databankDao.dataWrite(dto);
	}

	@Override
	public void dataUpdate(DatabankDTO dto) throws Exception {
		databankDao.dataUpdate(dto);
	}

	@Override
	public void dataDelete(int rno) throws Exception {
		databankDao.dataDelete(rno);
	}

	
}
