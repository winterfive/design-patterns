package observer;

public class SpidermanRide extends Observable{
	
	private int waitMins = 35;	
	
	public int getWaittime() {
		return waitMins;
	}

	public void setWaittime(int waittime) {
		this.waitMins = waittime;
	}

}
