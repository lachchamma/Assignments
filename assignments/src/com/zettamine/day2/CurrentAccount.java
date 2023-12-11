package com.zettamine.day2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CurrentAccount extends Account {
private static int transcationCount;

public CurrentAccount(long accountNumber,String customerName,
	  double balance) {
	super(accountNumber,customerName,balance);
	
   }

@Override
public double deposit(double deposit) {
	transcationCount++;
	return super.deposit(deposit);
}

@Override
public double withdraw(double withdrawAmount) {
	transcationCount++;
	return super.withdraw(withdrawAmount);
}

@Override
public String details() {
	transcationCount++;
	return super.details();
}
public int serviceCharges() {
	int transcationCountLimit=3;
	if(transcationCount>transcationCountLimit) {
		int charges=(transcationCount-transcationCountLimit)*100;
		setBalance(getBalance()-charges);
		System.out.println("Remaing Balance is: "+getBalance());
		return charges;
	}
	return 0;
}


}
