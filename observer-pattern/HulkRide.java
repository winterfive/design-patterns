package observer;

import java.util.Observable;

public class HulkRide extends Observable{
	
	private int waitMins = 10;
		
	public int getWaittime() {
		return waitMins;
	}

	public void setWaittime(int waittime) {
		this.waitMins = waittime;
	}
}
