package edu.deepak._06_ConstrucorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class DrawingApp {

		public static void main(String[] args) {

			ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
			Triangle triangle = (Triangle) context.getBean("triangle");
			triangle.draw();
			
			triangle = (Triangle) context.getBean("triangle-index");
			triangle.draw();
			
			triangle = (Triangle) context.getBean("triangle-type");
			triangle.draw();
			
			triangle = (Triangle) context.getBean("triangle-height");
			triangle.draw();
			
		}
}
