package com.LeeGainer.observer;

public class Guest implements Observer, Display{	
	private Subject rideData;

	public Guest(Subject rideData) {
		this.rideData = rideData;
		rideData.registerObserver(this);
	}

	public void update(int waitTime) {
		display(waitTime);		
	}

	public void display(int waitTime) {
		System.out.println("The current wait time for the Hulk Coaster is " + waitTime + " minutes.");
		
	}	
}
