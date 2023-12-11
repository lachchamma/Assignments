package com.zettamine.day4;

import java.util.Scanner;

public class DrawingApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out
				.print("Which shape do you want to work with? \n" + " 1.Rectangle\n " + "2.Circle\n " + "3.Triangle\n");
		int option = sc.nextInt();
		Shape s = null;

		switch (option) {
		case 1:

			System.out.print("Enter color of retangle :");
			String color = sc.next();
			System.out.print("Enter  Length of retangle:");
			int length = sc.nextInt();
			System.out.print("Enter breadth of retangle");
			int breadth = sc.nextInt();
			s = new Retangle(color, length, breadth);
			break;
		case 2:

			System.out.println("Enter color of Circle :");
			color = sc.next();
			System.out.println("Enter  radius of circle:");
			int radius = sc.nextInt();
			s = new Circle(color, radius);
			break;
		case 3:

			System.out.print("Enter color of Triangle :");
			color = sc.next();
			System.out.print("Enter  height of triangle:");
			int height = sc.nextInt();
			System.out.println("Enter  base of triangle:");
			int base = sc.nextInt();
			s = new Triangle(color, height, base);
			break;
		default:
			System.out.println("Invalid shape selected:: try again---");

		}
		getDetails(s);

	}

	private static void getDetails(Shape s) {
	
			System.out.println("=".repeat(17) + " SELECTED SHAPE:" + s.getClass().getSimpleName() + "=".repeat(17));
			System.out.println("Color of " + s.getClass().getSimpleName() + " is: " + s.getColour());
			System.out.print("Chage the Color:[Y/N] ");
			String chageColor = sc.next();
			if (chageColor.equalsIgnoreCase("yes")) {
				System.out.print("Enter updated color of " + s.getClass().getSimpleName() + " is :");
				s.setColour(chageColor);
				System.out.println( "Updated color is: "+s.getColour());
			s.getArea();
			} else if(chageColor.equalsIgnoreCase("no")){
				System.out.println(s.getColour());
			}else {
				System.out.println("Invalid input");
			}
		}

	}

