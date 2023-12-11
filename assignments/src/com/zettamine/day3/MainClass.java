package com.zettamine.day3;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student details and Hostel Details: ");
		
	
	System.out.print("Student Id:");
	int stuId=	sc.nextInt();
	System.out.print("Student Name:");
	String stuName=sc.nextLine();
	System.out.print("DepartMent Id:");
	int deptId=sc.nextInt();
	System.out.print("Gender [M/F]");
	String geneder=sc.nextLine();
	System.out.print("Phone Number:");
	long phNo=sc.nextLong();
	System.out.print("Hostel Name:");
	String hostelName=sc.nextLine();
	System.out.print("Room Number:");
	int roomNumber=sc.nextInt();
	Hosteller h1=new Hosteller(stuId,stuName,deptId,geneder,phNo,hostelName,roomNumber);
	System.out.print("Modify RoomNumber:");
	String modifyRoomNumber=sc.nextLine();
	if(modifyRoomNumber.equalsIgnoreCase("yes")) {
		System.out.println("New Room Number:");
		h1.setRoomNumber(sc.nextInt());
	}
	else {
		System.out.println("Wrong input");
	}
	
	int newRoomNumber=sc.nextInt();
	System.out.print("Modify Phone Number:");
	String modifyPhNumber=sc.nextLine();
	if(modifyPhNumber.equalsIgnoreCase("yes")) {
	System.out.print("New Phone Number:");
	h1.setPhone(sc.nextLong());
	}
	else {
		System.out.println("Wrong input");
	}
	
	
	System.out.println("Student Id:"+h1.getStudentId());
	System.out.println("Student Name: "+h1.getName());
	System.out.println("Department id:"+h1.getDepartmentId());
	System.out.println("Geneder :"+h1.getGender());
	System.out.println("Phone Numbet:"+h1.getPhone());
	System.out.println("HostelName:"+h1.getRoomNumber());
	System.out.println("Room Number:"+h1.getRoomNumber());
		

	}

	
	

}
