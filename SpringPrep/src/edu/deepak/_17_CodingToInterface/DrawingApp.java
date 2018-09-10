package edu.deepak._17_CodingToInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring17.xml");
		
		//Coding by class
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		
		//Coding by interface
		Shape shape = (Shape) context.getBean("triangle");
		shape.draw();
		
		shape = (Shape) context.getBean("circle");
		shape.draw();
	}

}
