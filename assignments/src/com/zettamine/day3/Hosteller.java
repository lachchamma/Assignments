package com.zettamine.day3;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//Pending 
public class Hosteller extends Student1 {
	
	
	
	private  String hostelName; 
	private int roomNumber;
	public Hosteller(int studentId, String name, int departmentId,
			String gender, long  phone,String hostelName,int roomNumber) {
		super(studentId, name, departmentId, gender, phone);
		this.hostelName=hostelName;
		this.roomNumber=roomNumber;
		
	}
	
	
		
		
		
		
	}



