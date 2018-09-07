package edu.deepak._16_BeanFactoryPostProcessor;

import edu.deepak._16_BeanFactoryPostProcessor.Point;

public class Triangle {
	private Point a, b, c;

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public void draw() {
		System.out.println("Point A : " + getA() == null ? "null" : getA());
		System.out.println("Point B : " + getB() == null ? "null" : getB());
		System.out.println("Point C : " + getC() == null ? "null" : getC());
	}

}
