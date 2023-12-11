package com.zettamine.day2;

public class MovieTicketCalculation {
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public MovieTicketCalculation(int ticketid, int price) {
		
		this.ticketid = ticketid;
		this.price = price;
	}
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0) {
		MovieTicketCalculation.availableTickets = availableTickets;
		}
	}
	public int calculateTicketCost(int nooftickets) {
		int amount;
		if( MovieTicketCalculation.getAvailableTickets()>nooftickets) {
			 MovieTicketCalculation.setAvailableTickets( MovieTicketCalculation.getAvailableTickets()-nooftickets);
			 amount=nooftickets*price;
			return amount;
		}
		return -1;
		
		
	}
	


}
