package edu.deepak._18_Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

	private Point center;
	
	public Circle(){}	
	
	public Circle(Point center) {
		this.center = center;
	}

	
	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle's drawn.\nIt's centre is at PointA: (" + getCenter().getX() + ", " + getCenter().getY() + ")");
	}
}
