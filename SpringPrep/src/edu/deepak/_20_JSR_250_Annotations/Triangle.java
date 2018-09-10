package edu.deepak._20_JSR_250_Annotations;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * We'hv used Autowired annotations while class definitions, so no need to define again in spring config.xml 
 */
public class Triangle implements Shape {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	@Autowired
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	@Autowired
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	@Autowired
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("PointA: (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println("PointB: (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("PointC: (" + getPointC().getX() + ", " + getPointC().getY() + ")");
	}

}
