package com.LeeGainer.observer;

import java.util.Observable;
import java.util.Observer;

public class Guest implements Observer, Display{	
	public Guest(Observable rd) {
		rd.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if(observable instanceof RideData) {
			int waitTime = ((RideData) observable).getRideTime();
			display(waitTime);
		}				
	}

	public void display(int waitTime) {
		System.out.println("The current wait time for the Hulk Coaster is " + waitTime + " minutes.");
		
	}
	
	public void speak(String rideName) {
		System.out.println("I can't wait to go on the " + rideName + "!");
	}
}
