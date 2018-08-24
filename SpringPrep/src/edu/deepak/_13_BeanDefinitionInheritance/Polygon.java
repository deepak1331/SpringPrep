package edu.deepak._13_BeanDefinitionInheritance;

import java.util.List;

public class Polygon {

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {

		System.out.println("No of points in Polygon are : " + points.size());
		for (Point p : getPoints()) {
			System.out.println("(" + p.getX() + ", " + p.getY() + ")");
		}
	}
}
