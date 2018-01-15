package observer;

import java.util.*;

public class Observable {
	
	void addObserver() {}
	void deleteObserver() {}
	void notifyObserver() {}
	void setChange() {}
	
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
