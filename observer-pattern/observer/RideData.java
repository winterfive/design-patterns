package observer;

import java.util.Observable;

public class RideData extends Observable{
	private int hulkWaitTime;
	private int spidermanWaitTime;
	private int forbiddenWaitTime;
	
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
