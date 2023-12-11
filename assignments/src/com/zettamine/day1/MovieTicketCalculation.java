package com.zettamine.day1;

import java.util.Scanner;

public class MovieTicketCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of tickets: ");
		int noOfTickets = sc.nextInt();
		System.out.println("Do you want to refreshMent: ");
		String mesg = sc.next();
		System.out.println("Do you have coupon code:");
		String mesgCoupon = sc.next();
		System.out.println("Enter the circle:");
		String circle = sc.next();
		calculateMovieTickects(noOfTickets, mesg, mesgCoupon, circle);

	}
	/*this method calculate the 
	 * 
	 */

	private static void calculateMovieTickects(int noOfTickets, String mesgRefreshMent, 
			String mesgCoupon, String circle) {
		
		int kingCost=75,totalCost=0;
		int queenCost=150;
		int refreshCost=50;
		double Cost,totalCost1,totalCost2=0,totalCost3,totalCost4=0;
		
		if(noOfTickets>=5&&noOfTickets<=40) {
			//if condition 1 open to check noOfTickets
			 if(circle.equals("k") || circle.equals("q")) {
		         if(circle.equals("k")){
		        	 totalCost=noOfTickets*75;
		         } else if (circle.equals("q")){
		        	 totalCost=noOfTickets*150;
		         }
		         else{
		           System.out.println("Invalid Input");
		        }
		         System.out.println(totalCost);
		         if(noOfTickets>20){
		        	 totalCost1=((0.1)*totalCost);
		        	 totalCost2=totalCost-totalCost1;
		           System.out.println(totalCost2);
		         }
		         else{
		        	 Cost=totalCost;
		         }
		             if(mesgCoupon.equals("y")){
		            	 totalCost3=((0.02)*totalCost2);
		            	 totalCost4=totalCost2-totalCost3;
		                System.out.println(totalCost4);
		             }
		             else{
		                 Cost=totalCost2;
		             }
		                 if(mesgRefreshMent.equals("y")){
		                	 refreshCost=noOfTickets*50;
		                     Cost=totalCost4+refreshCost;
		                     System.out.println("Total Cost:"+Cost);
		                 }else{
		                	 Cost=totalCost4;
		                	 System.out.println("Ticket cost:" +Cost);
		                 }

                    
		         }

		         else{
		             System.out.println("Invalid Input");
		         }
			 }
		         else{
		             System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		         }

		             }
	

}
		                 


     
