package com.LeeGainer.observer;

import java.util.ArrayList;
import java.util.Random;

public class RideData implements Subject{
	private ArrayList<Observer> observers;
	private int waitTime;
	boolean running = true;
	
	public RideData() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer newObserver) {
		observers.add(newObserver);		
	}

	public void deleteObserver(Observer deleteObserver) {
		int i = observers.indexOf(deleteObserver);
		if(i >= 0) {
			observers.remove(i);
		}		
	}

	public void notifyObserver() {
		waitTime = getRideTime();
		for (Observer o : observers) {
			o.update(waitTime);
		}		
	}
	
	public void timeChanged() {
		notifyObserver();
	}
	
	/*
	 * Generates a random number <= 100
	 * that is divisible evenly by 5 
	 * and returns it as waitTime (ex. 10, 45)
	 */
	int getRideTime() {		
		while(running) {
			Random r = new Random();
			waitTime = r.nextInt(100);
			if(waitTime % 5 != 0) {
				continue;
			} else {
				running = false;
			}			
		}
		return waitTime;		
	}
}
