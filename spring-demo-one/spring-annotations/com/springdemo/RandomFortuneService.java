package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService1 {
	
	private String[] data = {
			"Beware of the wolf in shee'ś clothing",
			"Diligence is the mother of the good luck",
			"The journey is the reward"
	};
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
