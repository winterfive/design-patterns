package com.LeeGainer.observer;

import java.util.Observable;
import java.util.Random;

public class RideData extends Observable{
	private int waitTime;
	
	public RideData() {}
	
	public void timeChanged() {
		setChanged();
		notifyObservers();
	}
	
	/*
	 * Generates a random number <= 100
	 * that is divisible evenly by 5 
	 * and returns it as waitTime (ex. 10, 45)
	 * void -> int
	 */
	public int getRideTime() {
		boolean running = true;
		int newTime = 0;
		int oldTime = waitTime;
		while(running) {
			Random r = new Random();
			newTime = r.nextInt(100);
			// System.out.println("OldTime: " + oldTime + ", newTime: " + newTime);
			if(newTime % 5 != 0 && newTime != oldTime) {
				continue;
			} else {
				running = false;
			}			
		}
		return newTime;		
	}
}
