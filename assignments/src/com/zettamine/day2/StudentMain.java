package com.zettamine.day2;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Student's Id");
	  int studId=sc.nextInt();
	  System.out.println("Enter Student's Name: ");
	  String stuName=sc.next();
	  System.out.println("Enter Student Address: ");
	  String stuAddress=sc.next();
	  System.out.println("Whether the student is from NIT(Yes/No): ");
	  String nitOrNot=sc.next();
	  
	  Student s1=null;
	  if(nitOrNot.equalsIgnoreCase("yes")) {
			 s1=new Student(studId,stuName,stuAddress);
			s1.setCollegeName("NIT");
	  }else if(nitOrNot.equalsIgnoreCase("no")) {
		  System.out.println("Enter College Name");
		  String collegeName=sc.next();
		  s1=new Student(studId,stuName,stuAddress,collegeName);
	  }else {
		  System.err.println("Wrong Input");
	  }
		  
		        System.out.println("Student ID: "+s1.getStudentId());
				System.out.println("Student Name: "+s1.getStudentName());
				System.out.println("Student Address: "+s1.getStudentAddress());
				System.out.println("College Name:  "+s1.getCollegeName());
				sc.close();
				
			}
				
			}
	  
	 

	

