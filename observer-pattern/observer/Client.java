package observer;

import java.util.Random;

public class Client {
	
	public static void main(String[] args) {
		
		HulkWaittime hulkRide = new HulkWaittime();
		SpidermanWaittime spidermanRide = new SpidermanWaittime();		
		
		int hulkWait = hulkRide.getWaittime();
		int spidermanWait = spidermanRide.getWaittime();
		
		// invoke new random for waittime int for Hulk
		// notify observers of new waittime
		
		// invoke new random for waittime int for Spiderman
		// notify observers of new waittime
		
		
		
		
	}
	
	/*
	 * Generates random between 0 and 100
	 * void -> int 
	 */	
	public int getRandomNum() {
		Random r = new Random();
		int x = r.nextInt(100);
		return x;		
	}

}
