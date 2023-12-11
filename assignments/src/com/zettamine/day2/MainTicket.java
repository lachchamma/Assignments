package com.zettamine.day2;

import java.util.Scanner;

public class MainTicket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no of bookings:");
		int booking=sc.nextInt();
		System.out.print("Enter Available tickets:");
		MovieTicketCalculation.setAvailableTickets(sc.nextInt());
	while(booking>0) {
	
		System.out.print("Enter the ticket Id:");
		int id=sc.nextInt();
		System.out.print("enter the Price:");
		int price=sc.nextInt();
		System.out.print("enter the no of tickets:");
		int noOfTickets=sc.nextInt();
		
		
		MovieTicketCalculation m=new MovieTicketCalculation(id,price);
		
		System.out.println("Available Tickets:"+m.getAvailableTickets());
		System.out.println("Total Amount:"+m.calculateTicketCost( noOfTickets));
		System.out.println("Available Tickets After Booking:"+m.getAvailableTickets());
		booking--;
		}
		sc.close();
	}

}
