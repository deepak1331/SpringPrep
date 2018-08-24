package edu.deepak._12_ApplicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring12.xml");

		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		

		Triangle triangle1 = (Triangle) context.getBean("triangle2");
		triangle1.draw();

	}

}
