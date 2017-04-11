package com.cinema.movieticket;

public class OAPMovieTicket extends MovieTicket {
	private int price = 6; 
	
	@Override
	public int getPrice() {
		return price;
	}
		
	protected void setPrice(int price) {
		this.price = price;	
	}
}
