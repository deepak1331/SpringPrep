package edu.deepak._14_LifeCycleCallback;

public class Circle {

	private Point a;

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public void draw() {
		System.out.println("\nCentre of Cirle is Point A : " + getA() == null ? "null" : getA());
	}

	public void myInit() {
		System.out.println("myInit method called for Circle");
	}

	public void myDestroy() {
		System.out.println("myDestroy method called for Circle");
	}
}
