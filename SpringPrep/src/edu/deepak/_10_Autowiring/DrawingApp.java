package edu.deepak._10_Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Autowiring is the Spring feature which enables it to initialize beans without explicitly writing it in configuration.xml file.
//It has 3 types : autowire = { byName / byType / constructor}
//byName: bean with the same name, as class members should be present in the xml file.
//byType: there should be only one bean of one type in the xml fine, 2 or more bean of same type bring in ambiguity, uses setter method
//constructor: : there should be only one bean of one type in the xml fine, 2 or more bean of same type bring in ambiguity, uses constructor

public class DrawingApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring10.xml");
		
		Circle c = (Circle)context.getBean("circle");
		c.draw();
		Circle c2 = (Circle)context.getBean("circle");
		c2.draw();
	   
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		
	}

}
