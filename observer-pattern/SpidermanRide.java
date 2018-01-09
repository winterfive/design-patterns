package observer;

import java.util.Observable;

public class SpidermanWaittime extends Observable{
	
	private int waittime;
	
	public void setChange() {
		super.setChanged();
	}

}
