package com.zettamine.day4;

public class Retangle extends Shape {
	private int length;
	private int breadth;

	public Retangle(String colour, int length, int breadth) {
		super(colour);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void getArea() {
		double area;

		area = length * breadth;
		System.out.printf("Area of Retangle is:0.2d%",area);

	}

}
