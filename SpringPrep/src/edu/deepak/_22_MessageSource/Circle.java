package edu.deepak._22_MessageSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class Circle {

	private Point center;
	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		// taking from myMessage.properties instead

		// System.out.println("Circle's drawn.");
		System.out.println(getMessageSource().getMessage("greeting2", null, null));

		System.out.println(getMessageSource().getMessage("drawing.circle", null, null));
		System.out.println("Center's Coordinates: (" + getCenter().getX() + ", " + getCenter().getY() + ")");
		System.out.println(getMessageSource().getMessage("drawing.center",
				new Object[] { getCenter().getX(), getCenter().getY() }, "Default point coordinates msg", null));
	}
}
