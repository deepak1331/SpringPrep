package edu.deepak._14_LifeCycleCallback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//Spring specific interfaces to implement init and destroy method
public class Triangle implements InitializingBean, DisposableBean {

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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Triangle");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DesposableBean destroy Method called for Triangle");

	}

}
