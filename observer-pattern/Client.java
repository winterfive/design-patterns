package com.LeeGainer.observer;

public class Client {
	
	public static void main(String[] args) {
		 Client myClient = new Client();
		 myClient.begin();		 
	}

	private void begin() {
		RideData rd = new RideData();
		Guest myGuest = new Guest(rd);
		int waitTime = rd.getRideTime();
		myGuest.display(waitTime);		
	}
}
