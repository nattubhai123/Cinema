package com.cinema.price.calculator;

import com.cinema.movieticket.MovieTicket;

public class MovieTicketPriceCalculator {
	private int getIndividualTicketPrice(MovieTicket type, String weekDay) {
		int individualTicketPrice = 0;
		if (weekDay.equalsIgnoreCase("WED")) {
			individualTicketPrice = type.getPrice() - 2;
		} else {
			individualTicketPrice = type.getPrice();
		}
		
		return individualTicketPrice;
	}
	
	public int getGroupPrice(MovieTicket type, int totalTickets, String weekDay) {
		return getIndividualTicketPrice(type, weekDay) * totalTickets;
	}
}
