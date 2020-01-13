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
		Coach1 theCoach = context.getBean("swimCoach", Coach1.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method with dependency injection
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
