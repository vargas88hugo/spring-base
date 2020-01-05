package com.springdemo;

/**
 * This class is to implements Dependency Injection
 */
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService1 implements FortuneService1 {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
