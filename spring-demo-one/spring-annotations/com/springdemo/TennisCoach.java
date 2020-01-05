package com.springdemo;

import org.springframework.stereotype.Component;

/**
 * Class to be implemented in the spring Container. If no
 * arguments is placed in the component decorator, the 
 * name it will have will be the default class name
 */
@Component("thatSillyCoach")
public class TennisCoach implements Coach1 {

	@Override
	public String getDailyWorkout() {
		return "Practice your Backend volley";
	}

}
