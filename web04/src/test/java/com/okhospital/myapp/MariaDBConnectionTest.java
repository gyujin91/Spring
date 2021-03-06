package com.okhospital.myapp;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.okhospital.base.HomeController;

class MariaDBConnectionTest {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	// DB 연결 변수
	private static final String DRIVER = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb:localhost:3308/company";
	private static final String USER = "root";
	private static final String PW = "1234";
	
	
	@Test
	void oracleConnectionTest() throws Exception {
		Class.forName(DRIVER);
		try {
			Connection conn = DriverManager.getConnection(URL, USER, PW);
			System.out.println(conn);
			logger.info("mariaDB 연결 성공");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
