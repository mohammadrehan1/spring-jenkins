package com.rehan.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	static Logger log=LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	//dummy test case to just check
	@Test
	void contextLoads() {
		log.info("Test case executing....");
		assertEquals(true, true);
	}

}
