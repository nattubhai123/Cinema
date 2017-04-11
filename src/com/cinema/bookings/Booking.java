package com.cinema.bookings;

import com.cinema.movieticket.ChildMovieTicket;
import com.cinema.movieticket.MovieTicket;
import com.cinema.movieticket.OAPMovieTicket;
import com.cinema.movieticket.StandardMovieTicket;
import com.cinema.movieticket.StudentMovieTicket;
import com.cinema.price.calculator.MovieTicketPriceCalculator;

public class Booking {
	public static void main(String args[]) {
		int totalPrice = 0;
		MovieTicketPriceCalculator calculator = new MovieTicketPriceCalculator();
		String weekDay = args[0];

		for (int i = 1; i < args.length; i++) {
			String arg = args[i];
			if (i > 0) {
				MovieTicket ticket = getMovieTicket(arg.toUpperCase().charAt(1));
				if (ticket != null) {
					totalPrice += calculator.getGroupPrice(ticket, getTotalTickets(arg), weekDay);
				}
			}
		}
		System.out.println("The total cost of tickets for this movie is £" + totalPrice);
	}

	private static int getTotalTickets(String arg) {
		int tickets = Integer.parseInt(""+arg.charAt(0));
		return tickets;
	}

	private static MovieTicket getMovieTicket(char type) {
		switch (type) {
		case 'C':
			return new ChildMovieTicket();

		case 'S':
			return new StudentMovieTicket();

		case 'O':
			return new OAPMovieTicket();

		case 'A':
			return new StandardMovieTicket();

		default:
			return null;
		}
	}
}
