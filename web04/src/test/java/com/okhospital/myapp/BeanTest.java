package com.okhospital.myapp;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

// 1. sring 과 juint의 연동
@RunWith(SpringRunner.class)
// 2. 데이터 바인딩 환경 설정을 어디에서 가져올 것 인가?
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
class BeanTest {
	// 해당 컨텍스트를 불러와 자동으로 메모리로 로딩시켜 놓으면,
	// 원하는 구현 클래스가 알아서 실행 시켜준다.
	// -> 의존성 주입
	@Autowired
	ApplicationContext ctx;
	@Test
	void beanTest() {
		assertNotNull(ctx);
		/* fail("Not yet implemented"); */
	}

}
