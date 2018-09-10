package edu.deepak._17_CodingToInterface;

public class Circle implements Shape{

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
		System.out.println("Circle's drawn.\nIt's centre is at PointA: (" + getPointA().getX() + ", " + getPointA().getY() + ")");
	}
}
