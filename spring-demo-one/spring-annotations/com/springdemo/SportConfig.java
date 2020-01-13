package com.springdemo;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.springdemo")
public class SportConfig {	
	
	// define bean for our fortune service
	@Bean
	public FortuneService1 sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach and inject dependency
	@Bean
	public Coach1 swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
