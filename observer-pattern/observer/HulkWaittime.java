package observer;

import java.util.Observable;

public class HulkWaittime extends Observable{
	
	private int waittime;
	
	public void setChange() {
		super.setChanged();
	}

}
