package com.zettamine.day2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;

	public Student(int studentId, String studentName, String studentAddress) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;

	}

	
	

}
