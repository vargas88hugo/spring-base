package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		
		// retrieve bean from spring container
		Coach1 theCoach = context.getBean("thatSillyCoach", Coach1.class);
		
		Coach1 alphaCoach = context.getBean("thatSillyCoach", Coach1.class);
		
		// check if are the same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);

		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		context.close();
	}

}
