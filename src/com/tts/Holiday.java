package com.tts;

import java.util.ArrayList;

public class Holiday {

	private String name;
	private String date;
	private int rating;
	private boolean receivedGifts;
	private ArrayList<String> gifts = new ArrayList<>();
	
	
	public Holiday() {
		this.name = "default";
		this.date = "default";
		this.rating = 0;
		this.receivedGifts = false;
	}
	
	public Holiday(String name, String date) {
		this.name = name;
		this.date = date;
	}
	
	public Holiday(String name, String date, int rating) {
		this.name = name;
		this.date = date;
		this.rating = rating;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	 
	
	public String getDate() {
		return this.date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	 
	
	public int getRating() {
		return this.rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String enjoyment() {
		
		int r = this.rating;
		
		if (r > 5) {
			return "Happy Holiday!";
		} else if (r == 5) {
			return "Could be better.";
		}
		
		return "Errrrrrrrrrrr!";
		
	}
	
	public void gifted(String gift) {
		this.gifts.add(gift);
		increaseRating();
		
		if (!this.receivedGifts) {
			received();
		}
	}
	
	private void received() {
		this.receivedGifts = true;
	}
	
	public void printGifts() {
		if (this.receivedGifts) {
			for (String g : this.gifts) {
				System.out.printf("%s, ", g);
			}
			System.out.println();
			return;
		}
		
		System.out.println("Unlucky!!!!");
	}
	
	private void increaseRating() {
		this.rating++;
	}
	
}
