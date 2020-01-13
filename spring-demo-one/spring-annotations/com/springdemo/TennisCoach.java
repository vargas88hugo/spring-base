package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Class to be implemented in the spring Container. If no
 * arguments is placed in the component decorator, the 
 * name it will have will be the default class name. The
 * constructor implements Dependency Injection
 */
@Component("thatSillyCoach")
@Scope("prototype")
public class TennisCoach implements Coach1 {
	
	// We can also apply Dependency Injection via fields
	// @Autowired
	private FortuneService1 fortuneService;
	
	// Define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	/**
	 * This setter applies a Dependency Injection by setter. We can also 
	 * apply a Dependency Injection by a regular method
	 * @param fortuneService1
	 */
	@Autowired
	@Qualifier("randomFortuneService") // This is when we have more than one dependency classes
	public void SetFortuneService(FortuneService1 fortuneService) {
		System.out.println(">> TennisCoach: inside setter method");
		this.fortuneService = fortuneService;
	}
	
	/**
	 * Dependency Injection by Constructor
	 *
	@Autowired
	public TennisCoach(FortuneService1 fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

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
