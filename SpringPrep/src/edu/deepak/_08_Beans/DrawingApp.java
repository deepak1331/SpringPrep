package edu.deepak._08_Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Inner bean, alias, and idref
public class DrawingApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring8.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

		triangle = (Triangle) context.getBean("trikon");
		triangle.draw();

	}

}
