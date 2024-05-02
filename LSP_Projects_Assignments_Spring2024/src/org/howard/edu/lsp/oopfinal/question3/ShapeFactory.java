package org.howard.edu.lsp.oopfinal.question3;

//ShapeFactory.java
public class ShapeFactory {
	public static Shape createShape(String type) {
	     if ("Circle".equalsIgnoreCase(type)) {
	         return new Circle();
	     } else {
	         return new Rectangle();
	     }
	}
}
