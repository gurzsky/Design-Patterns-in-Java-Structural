package com.course.bridge.shape2;

public class Shape2BridgeDemo {

	public static void main(String[] args) {
		
		Color blue = new Blue();
		
		Square square = new Square(blue);
		
		Color red = new Red();
		
		Shape circle = new Circle(red);
		
		square.applyColor();
		circle.applyColor();

	}

}
