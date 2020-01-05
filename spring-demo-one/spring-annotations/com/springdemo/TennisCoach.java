package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class to be implemented in the spring Container. If no
 * arguments is placed in the component decorator, the 
 * name it will have will be the default class name. The
 * constructor implements Dependency Injection
 */
@Component("thatSillyCoach")
public class TennisCoach implements Coach1 {
	
	private FortuneService1 fortuneService;
	
	/**
	 * Dependency Injection by Constructor
	 */
	@Autowired
	public TennisCoach(FortuneService1 fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your Backend volley";
	}

	/**
	 *  Method to implement Dependency Injection
	 */
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
