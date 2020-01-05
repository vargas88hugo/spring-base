package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach1 theCoach = context.getBean("myCoach", Coach1.class);
		Coach1 alphaCoach = context.getBean("myCoach", Coach1.class);
		
		// check if they are the same beans
		boolean result = theCoach == alphaCoach;
		
		System.out.println("\nPoint to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		context.close();
	}

}
