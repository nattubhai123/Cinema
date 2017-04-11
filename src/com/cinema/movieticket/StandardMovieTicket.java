package com.cinema.movieticket;

public class StandardMovieTicket extends MovieTicket {
	private int price = 8; 
	
	@Override
	public int getPrice() {
		return price;
	}
		
	protected void setPrice(int price) {
		this.price = price;	
	}
}
