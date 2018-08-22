package edu.deepak._10_Autowiring;

public class Circle {

	private Point pointA;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void draw() {
		System.out.println("Center of the Circle = PointA: (" + getPointA().getX() + ", " + getPointA().getY() + ")");

	}
}
