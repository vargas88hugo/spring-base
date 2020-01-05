package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This program introduces the concept of annotations in Java.
 * It is a way to generate inversion of control with java annotations,
 * facilitating the verbose declaration that can be frustrating 
 * in xml.
 * @author Hugo Vargas
 *
 */
public class Main {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		
		// get the bean from spring container
		Coach1 theCoach = context.getBean("thatSillyCoach", Coach1.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
