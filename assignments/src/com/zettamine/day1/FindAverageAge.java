package com.zettamine.day1;

import java.util.Scanner;

public class FindAverageAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] age=null;
		System.out.println("Enter no of employees: ");
		int noOfEmployees=sc.nextInt();
		
		if(noOfEmployees>=2) {
		 age=new int[noOfEmployees];
		System.out.println("Enter the age for  employees: ");
		for(int i=0;i<age.length;i++) {
			age[i]=sc.nextInt();
		}
		for(int i=0;i<age.length;i++) {
			if((age[i]<28) || (age[i]>40)) {
				System.err.println("Invalid age Encoutered");
				System.exit(0);
			}
				
			}
		}else {
			System.err.println("Please enter a valid employee count ");
			System.exit(0);
		}
		
		System.out.println(calculateAverage( age));;
		sc.close();
		
	}

	private static double calculateAverage(int[] age) {
		int sumAge=0;
		for(int i=0;i<age.length;i++) {
			sumAge=age[i]+sumAge;
			
		}
		double aveAge=sumAge/age.length;
		
		return aveAge;	

}
	
	
}
	

