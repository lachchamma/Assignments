package com.zettamine.day4;

public class Circle extends Shape {
	int radius;
	final float  pie=3.14f;
	

	public Circle(String colour, int radius) {
		super(colour);
		this.radius = radius;
	}


	@Override
	void getArea() {
		double area=pie*radius*radius;
		System.out.printf("Area of Circle is:0.2d%",area);
		
	}
	
	

}
