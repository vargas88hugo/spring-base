package com.springdemo;

public class SadFortuneService implements FortuneService1 {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
