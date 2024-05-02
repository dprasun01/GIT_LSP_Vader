package org.howard.edu.lsp.oopfinal.question3;

//ShapeFactory.java
public class ShapeFactory {
	public static Shape createShape(String type) {
	     if ("Circle".equalsIgnoreCase(type)) {
	         return new Circle();
	     } else if ("Rectangle".equalsIgnoreCase(type)) {
	         return new Rectangle();
	     } else {
	         throw new IllegalArgumentException("Invalid shape type: " + type);
	     }
	}
}
