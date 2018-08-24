package edu.deepak._12_ApplicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("PointA: (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		if (getPointB() != null)
			System.out.println("PointB: (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		else
			System.out.println("PointB: null");
		if (getPointC() != null)
			System.out.println("PointC: (" + getPointC().getX() + ", " + getPointC().getY() + ")");
		else
			System.out.println("PointC: null");
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is : " + beanName);

	}

}
