import java.util.Observable;
import java.util.Observer;

public class Guest implements Observer, Display{
	Observable observable;
	private int hulkWaitTime;
	private int spidermanWaitTime;
	private int forbiddenWaitTime;
	
	public Guest(Observable ob) {
		this.observable = ob;
		ob.addObserver(this);
	}
	
	public void update(Observable o, Object arg) {
		if(o instanceof RideData) {
			RideData rd = (RideData)o;
			this.hulkWaitTime = rd.getHulkWaitTime();
			this.spidermanWaitTime = rd.getSpidermanWaitTime();
			this.forbiddenWaitTime = rd.getForbiddenWaitTime();
			display();
		}
	}
	
	public void display() {
		System.out.println("Current Wait Times for:\n" +
				"Hulk Coaster - " + hulkWaitTime + "mins." +
				"Spiderman - " + spidermanWaitTime + "mins." +
				"Forbidden Journey - " + forbiddenWaitTime + "mins.");		
	}

}
