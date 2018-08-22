package edu.deepak._09_InitializingCollection;

import java.util.List;

public class Triangle {

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {

		System.out.println("\nCoordinates of Triangle : ");
		for (Point p : points) {
			System.out.println("Point : (" + p.getX() + ", " + p.getY() + ")");
		}
	}

}
