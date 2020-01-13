package com.springdemo;

public class SwimCoach implements Coach1 {
	
	private FortuneService1 fortuneService;
	
	public SwimCoach(FortuneService1 fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 100 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
