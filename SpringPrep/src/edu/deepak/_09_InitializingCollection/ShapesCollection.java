package edu.deepak._09_InitializingCollection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

public class ShapesCollection {

	private HashMap<String, Triangle> map;
	private Properties prop;

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public HashMap<String, Triangle> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Triangle> map) {
		this.map = map;
	}

	public void draw() {
		System.out.println("\n\nShapesCollection has "+getMap().size() +" entries.");
		for (Entry<String, Triangle> entry : getMap().entrySet()) {
			System.out.println("Name : "+entry.getKey());
			entry.getValue().draw();
		}
		
		System.out.println ("Admin : "+prop.getProperty("Admin"));
		System.out.println ("Support : "+prop.getProperty("Support"));
	}
}
