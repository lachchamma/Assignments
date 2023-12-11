package com.zettamine.day2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SavingAccount extends Account {
	private int interest;
	
	public SavingAccount(long accountNumber,
			String customerName,double intiDeposit,int interest) {
		super(accountNumber,customerName,intiDeposit);
	}
	public double calculateInterest() {
		return getBalance()*12*interest*0.001;
	}

}
