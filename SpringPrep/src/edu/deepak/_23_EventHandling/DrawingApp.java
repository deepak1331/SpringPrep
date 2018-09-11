package edu.deepak._23_EventHandling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Application Listener - publisher , listener and event itself
 * Additionally we can execute a method once an event occurs. 
 */
public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring23.xml");

		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
	}

}
