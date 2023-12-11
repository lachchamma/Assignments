package com.zettamine.day2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	private long accountNumber;
	private String customerName;
	private  double balance;
	
	
	
	

	

	
	public double deposit(double deposit ) {
		return balance+deposit;
		
	}
	public double withdraw(double withdrawAmount) {
		return balance-withdrawAmount;
	}
	
	
	public String details() {
		return "A/C NO: "+accountNumber+" | NAME: "+customerName+ " | BALANCE: "+balance+"/-";
		
	}
	
	
	

	

}
