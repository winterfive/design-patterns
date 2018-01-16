package com.LeeGainer.observer;

public class Guest implements Observer, Display{	
	public Guest(Subject rideData) {
		rideData.registerObserver(this);
	}

	public void update(int waitTime) {
		display(waitTime);		
	}

	public void display(int waitTime) {
		System.out.println("The current wait time for the Hulk Coaster is " + waitTime + " minutes.");
		
	}
	
	public void speak(String rideName) {
		System.out.println("I can't wait to go on the " + rideName + "!");
	}
}
