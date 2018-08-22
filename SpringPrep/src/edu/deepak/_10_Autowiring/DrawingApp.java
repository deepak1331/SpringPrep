package edu.deepak._10_Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring10.xml");
		
		Circle c = (Circle)context.getBean("circle");
		c.draw();
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		
	}

}
