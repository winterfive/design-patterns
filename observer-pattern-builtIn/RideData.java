package com.LeeGainer.observer;

import java.util.Observable;
import java.util.Random;

public class RideData extends Observable{
	private int waitTime = 10;
	
	public RideData() {}
	
	public void timeChanged() {
		setChanged();
		notifyObservers();
	}
	
	/*
	 * Generates a random number <= 125
	 * that is divisible evenly by 5 
	 * and returns it as waitTime (ex. 0, 55, 125)
	 * void -> int
	 */
	public int getRideTime() {
		boolean running = true;
		int newTime = 0;
		int oldTime = waitTime;
		while(running) {
			Random r = new Random();
			newTime = r.nextInt(26) * 5;
			// System.out.println("OldTime: " + oldTime + ", newTime: " + newTime);
			if(newTime == oldTime) {
				continue;
			} else {
				waitTime = newTime;
				running = false;
			}			
		}
		return newTime;		
	}
}
