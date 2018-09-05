package edu.deepak._14_LifeCycleCallback;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring14.xml");
		context.registerShutdownHook();

		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
	}
}
