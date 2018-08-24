package edu.deepak._10_Autowiring;

public class Circle {

	private Point pointA;
	
	public Circle(){}
	
	
	public Circle(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	

	public void draw() {
		System.out.println("Center's centre is at PointA: (" + getPointA().getX() + ", " + getPointA().getY() + ")");

	}
}
