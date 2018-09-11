package edu.deepak._21_ComponentAndStereotypeAnnotations;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println(
				"Circle's drawn.\nIt's centre is at PointA: (" + getCenter().getX() + ", " + getCenter().getY() + ")");
	}
}
