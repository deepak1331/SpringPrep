package edu.deepak._20_JSR_250_Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/*
 * @Resource : default is by name
 */
public class Circle implements Shape {

	private Point center;

	public Circle() {
	}

	public Circle(Point center) {
		this.center = center;
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name = "pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println(
				"Circle's drawn.\nIt's centre is at PointA: (" + getCenter().getX() + ", " + getCenter().getY() + ")");
	}
	
	@PostConstruct
	public void initializeCirlce(){
		System.out.println("Circle is initialized");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Circle is destroyed");
	}
}
