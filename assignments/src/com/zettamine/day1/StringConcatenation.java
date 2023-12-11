package com.zettamine.day1;

import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Inmates's name: ");
		String inMateName=sc.nextLine();
		System.out.println("Inmate's father Name: ");
		String inMateFatherName=sc.nextLine();
		String s1=inMateName;
		String s2=inMateFatherName;
		String regex="[A-Za-z]+[A-Za-z\\s]";
		
		if(s1.matches(regex) && s2.matches(regex) ) {
			String s3=s1.concat(" "+s2);
			System.out.println(s3);
		}
		else {
			System.out.println("Invalid input ? ");
		}

	}

}
