package com.LeeGainer.observer;

public class Client {
	
	public static void main(String[] args) {
		 Client myClient = new Client();
		 myClient.begin();		 
	}

	private void begin() {
		RideData rd = new RideData();
		Guest myGuest = new Guest(rd);
		boolean running = true;
		
		myGuest.speak("Hulk Coaster");		
		while(running) {
			rd.timeChanged();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
