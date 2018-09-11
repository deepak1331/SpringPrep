package edu.deepak._21_ComponentAndStereotypeAnnotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @Component: scans for all the packages for component annotations and initilize the object on its own
 * StereoType : Gives extra info about the bean role in the project to the spring.
 * It can be of 3 types:
 *  1) Service
 *  2) Repository
 *  3) Controller
 */

public class DrawingApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring21.xml");	
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
				
//		shape = (Shape) context.getBean("triangle");
//		shape.draw();
	}

}
