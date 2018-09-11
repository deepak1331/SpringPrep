package edu.deepak._22_MessageSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * MessageSource is an object which let us to read Static data/messages in the apps to be 
 * extracted from a property file instead of writing it down in code.
 *  We can use it as an member variable in the class itself.
 *  Or from the context.getMessage() in main method.
 */
public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring22.xml");

		Circle circle = (Circle) context.getBean("circle");
		circle.draw();

		System.out.println(context.getMessage("greeting", null, "Good Morning!", null));
		// context.getMessage("property_name", "placeholders", "default message or fallback if not found", Locale);

	}

}
