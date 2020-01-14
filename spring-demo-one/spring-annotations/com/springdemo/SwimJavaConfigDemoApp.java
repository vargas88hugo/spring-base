package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This program introduces the concept of annotations in Java.
 * It is a way to generate inversion of control with java annotations,
 * facilitating the verbose declaration that can be frustrating 
 * in xml.
 * @author Hugo Vargas
 *
 */
public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method with dependency injection
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods... has the property values injected
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
