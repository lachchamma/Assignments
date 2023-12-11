package com.zettamine.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class Student {
	private static String collegeName = "Chaitanya degree and pg college";
	private static int count = 100;
	private String studentId;
	private String studentName;
	private String studentEmail;

	static Scanner sc = new Scanner(System.in);

	public Student(String studentName, String studentEmail) {

		this.studentId = generateId();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}

	private String generateId() {

		return "Zetta_" + (++count);
	}

	public static void main(String[] args) {

		details();

	}

	public static void details() {

		while (true) {
			System.out.println("enter Student name and email address:");
			String name = sc.nextLine();

			String email = sc.next();

			Student student = new Student(name, email);

			System.out.println("Do you want to enter more than one student details?[Y/N] ");
			String mesg = sc.next();
			if (mesg.equalsIgnoreCase("NO")) {
				System.out.println("\t\tStudentId  |\t\tStudentName   |\t\tStudentEmail   |\t\tStudentCollegeName\t\t");
				System.out.println("\t\t" + student.getStudentId() + "|   \t\t\t" + student.studentName + "|   \t\t\t"
						+ student.studentEmail + "|      \t\t\t   " + Student.collegeName);
				break;
			} else if (!mesg.equalsIgnoreCase("yes") || mesg.equalsIgnoreCase("no")) {
				System.out.println("Invalid input");
				break;
			}
			continue;
		}

	}
}
