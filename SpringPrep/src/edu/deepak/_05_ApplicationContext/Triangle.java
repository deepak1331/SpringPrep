package edu.deepak._05_ApplicationContext;

public class Triangle {

	String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " Triangle Drawn.");
	}
}
