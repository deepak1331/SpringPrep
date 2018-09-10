package edu.deepak._18_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * * While using @Autowired, compiler will follow below matching rules:
 *  1) by Type
 *  2) by Name
 *  3) Using Qualifier
 *  
 *  @Required: make sure required marked property is set while compiling itself and gives proper exception msg
 *  with the class/member name where exception occurred. 
 * 
 */

public class DrawingApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring18.xml");		
		
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
		
//		shape = (Shape) context.getBean("triangle");
//		shape.draw();
	}

}
