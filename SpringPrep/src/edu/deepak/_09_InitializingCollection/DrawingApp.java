package edu.deepak._09_InitializingCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring9.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

		Square square = (Square) context.getBean("square");
		square.draw();
		
		ShapesCollection shapesCollection = (ShapesCollection) context.getBean("shapeCol");
		shapesCollection.draw();

	}

}
