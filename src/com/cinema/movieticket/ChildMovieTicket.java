package com.cinema.movieticket;

public class ChildMovieTicket extends MovieTicket {
	private int price = 4; 
	
	@Override
	public int getPrice() {
		return price;
	}
	
	protected void setPrice(int price) {
		this.price = price;	
	}
}
