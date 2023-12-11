package com.zettamine.day2;

public class LoanApp {

	public static void main(String[] args) {
		
		// emp=new PermanentEmployee(100, "Raju", 3000);
		Employee emp=new TemporaryEmployee(111, "Pranay", 10, 500);
		
		System.out.printf("Loan Amount is:"+calculateLoanAmount( emp)); 

	}

	private static double calculateLoanAmount(Employee emp) {
		double loan = 0;
		if(emp instanceof PermanentEmployee ) {
			emp.calculateSalary();
			 loan=emp.getSalary()*0.15;
			
		}else if(emp instanceof TemporaryEmployee) {
			emp.calculateSalary();
			loan=emp.getSalary()*0.10;
			
		}
		return loan;
		
	}

}
