package edu.deepak._04_XmlBeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springConfig.xml"));

		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();

	}

}
