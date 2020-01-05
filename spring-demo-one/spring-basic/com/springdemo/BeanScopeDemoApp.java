package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach1 theCoach = context.getBean("myCoach", Coach1.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
