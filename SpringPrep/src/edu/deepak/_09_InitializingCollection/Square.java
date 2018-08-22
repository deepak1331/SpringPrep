package edu.deepak._09_InitializingCollection;

import java.util.Set;

public class Square {
	
	private Set<Point> points;

	public Set<Point> getPoints() {
		return points;
	}

	public void setPoints(Set<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		System.out.println("\nCoordinates of Square : ");
		for (Point p : points) {
			System.out.println("Point : (" + p.getX() + ", " + p.getY() + ")");
		}
	}
	

}
