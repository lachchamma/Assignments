package com.zettamine.day2;

import java.util.Scanner;

public class BankApp {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
	Account acc=null;
	
	while(true) {
		System.out.print("1. Create Account\n"+
	                     "2. Deposit\n"
	                     +"3.Withdraw\n"+
	                     "4.AccountDetails\n"+
	                     "5.InterestAmount\n"+
	                     "6.Service Charges\n"+
	                     "7. Exit\n"+
	             		 "Please Enter your input: ");
		int input=sc.nextInt();
		sc.nextLine();
		if(input>=1 && input<=7) {
			switch(input) {
			case 1:
				if(acc!=null) {
					System.out.println("You have already created account with us");
				}
				while(acc==null) {
					System.out.println("1.Saving Account\n"+
				                        "2.Current Account\n"+
							"Enter your input: ");
					int accType=sc.nextInt();
					sc.nextLine();
					if(accType==1 || accType==2) {
						System.out.println("Enter Account Number: ");
						long accNumber=sc.nextLong();
						System.out.println("Enter account holder name: ");
						String name=sc.nextLine();
						System.out.println("Enter initial deposit amount :");
						double intiDeposit=sc.nextDouble();
						sc.nextLine();
						acc=createAccount(accType,accNumber,name,intiDeposit);
						System.out.println("---Welcome to our Bank--");
						if(acc!=null) {
							break;
						}else {
							System.out.println("Please enter a valid input");
						}
					}//inner while loop
					break;
				}
					case 2:
						if(acc==null) {
							System.out.println("Please open an Account with us");
							
						}else {
							System.out.println("Enter amount to deposit: ");
							double depositedAmount=sc.nextDouble();
							if(depositedAmount<=0) {
								System.out.println("--Not a Valid Amount---");
								break;
							}
							double totalAmount=acc.deposit(depositedAmount);
							System.out.println("DepositedAmount :"+depositedAmount+
									"/-\nTotal Balance :"+totalAmount+"/-");
							acc.setBalance(totalAmount);
				}
						break;
					case 3:
						if(acc==null) {
							System.out.println("Please open an account with us");
						}else {
							System.out.print("Enter the amount to withdraw: ");
							double withdrawAmount=sc.nextDouble();
							if(withdrawAmount>acc.getBalance()) {
								System.out.println("Error---> Insufficient Balance");
								break;
							}
							if(withdrawAmount<=0) {
								System.out.println("--Not a valid Amount---");
								break;
							}
							double totalAmount=acc.withdraw(withdrawAmount);
							System.out.println("Withdrawn amount :"+withdrawAmount+"/-\nTotal Balance:"+totalAmount+"/-");
							acc.setBalance(totalAmount);
						}
						break;
			
			case 4:
				if(acc==null) {
					System.out.println("Please open an Account with us");
				}else {
					System.out.println(acc.details());
				}
				break;
			case 5:
				if(acc==null) {
					System.out.println("Please open an Account with us");
				}else {
					if(acc instanceof SavingAccount) {
						System.out.println("Yearly Based interest is: "+
					((SavingAccount)acc).calculateInterest());
						
						
					}else {
						System.out.println("This Account does not support this ");
					}
				}
				break;
			case 6:
				if(acc==null) {
					System.out.println("Please open Account with us");
				}else {
					if(acc instanceof CurrentAccount) {
						System.out.println("Current Account Service "+"Charges: "
					                      +((CurrentAccount)acc).serviceCharges()+"/-");
					}
					else {
						System.out.println("This account does not support this ");
					}
				}
				break;
			case 7:
				System.out.println("--BYE  BYE----");
				System.exit(0);
				
					
				}
		}else {
			System.err.println("Invalid Operation Please try Again");
			try {
				Thread.currentThread().sleep(input);//
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	}

	private static Account createAccount(int input, long accNumber, String name, double intiDeposit) {
		if(input==1) {
			System.out.print("Enter the rate of interest: ");
			int interest=sc.nextInt();
			return new SavingAccount(accNumber,name,intiDeposit,interest);
		}else {
			return new CurrentAccount(accNumber,name,intiDeposit);
		}
		
	}

}
