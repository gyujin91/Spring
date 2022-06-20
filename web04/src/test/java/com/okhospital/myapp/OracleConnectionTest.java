package com.okhospital.myapp;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.okhospital.base.HomeController;


class OracleConnectionTest {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	//DB연결 변수
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "scott";
	private static final String PW = "tiger";
	
	@Test
	void oracleConnectionTest() throws Exception{
		Class.forName(DRIVER);
		try {
		Connection conn = DriverManager.getConnection(URL,USER,PW);
		System.out.println(conn);
		logger.info("Oracle 연결 성공");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
