package edu.deepak._15_BeanPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Spring execute some method after initializing all the beans, known as BeanPostProcessor
// BeanPostProcessor is a separate class which runs after every bean is initialized.
// can be used for extending the bean functionality etc, configuration related code overwrites
public class DrawingApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring15.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
