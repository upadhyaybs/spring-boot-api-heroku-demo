package com.codify.demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.codify.demo.controller.GreetingsController;


@SpringBootTest
@ActiveProfiles("test")
public class SpringBootApiHerokuDemoTests {

	@Autowired
	GreetingsController demoController;

	@Test
	public void contextLoads() {
		assertThat(demoController).isNotNull();
	}


	//@Test
	void testApplication() {
		MockedStatic<SpringApplication> utilities = Mockito.mockStatic(SpringApplication.class);
		utilities.when((MockedStatic.Verification) SpringApplication.run(SpringBootApiHerokuDemo.class, new String[]{})).thenReturn(null);
		SpringBootApiHerokuDemo.main(new String[]{});
		assertThat(SpringApplication.run(SpringBootApiHerokuDemo.class, new String[]{})).isEqualTo(null);
	}

}
