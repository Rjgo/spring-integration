package com.example.springintegration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = {TestConfiguration.class})
class SpringIntegrationApplicationTests {

	@Test
	void contextLoads() {
	}

}
