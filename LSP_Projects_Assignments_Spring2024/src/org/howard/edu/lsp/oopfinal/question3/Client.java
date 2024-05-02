package org.howard.edu.lsp.oopfinal.question3;

//Client.java
public class Client {
 public static void main(String[] args) {
     Shape circle = ShapeFactory.createShape("Circle");
     circle.draw();
     
     Shape rectangle = ShapeFactory.createShape("Rectangle");
     rectangle.draw();
 }
}


