package observer;

import java.util.Observable;

public class RideData extends Observable{
	private int hulkWaitTime = 30;
	private int spidermanWaitTime = 45;
	private int forbiddenWaitTime = 75;
	
	public RideData() {}	
	
	public void timeChanged() {
		setChanged();
		notifyObservers();
	}
		
	public void setWaitTimes(int hulkWaitTime, int spidermanWaitTime, int forbiddenWaitTime) {
		this.hulkWaitTime = hulkWaitTime;
		this.spidermanWaitTime = spidermanWaitTime;
		this.forbiddenWaitTime = forbiddenWaitTime;
		timeChanged();
	}

	public int getHulkWaitTime() {
		return hulkWaitTime;
	}

	public int getSpidermanWaitTime() {
		return spidermanWaitTime;
	}

	public int getForbiddenWaitTime() {
		return forbiddenWaitTime;
	}

	
	
}
