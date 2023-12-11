package com.zettamine.day4;

public class Triangle extends Shape{

	int height;
	int base;
	
	public Triangle(String colour, int height, int base) {
		super(colour);
		this.height = height;
		this.base = base;
	}

	@Override
	void getArea() {
		double area;
		area=0.5*height*base;
		System.out.printf("Area of Triangle is:0.2d%",area);
		
	}

}
