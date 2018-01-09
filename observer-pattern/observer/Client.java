package observer;

public class Client {
	
	public Client() {}
	
	public static void main(String[] args) {
		
		Client myClient = new Client();		
		myClient.beginApp();		
	}
	
	/*
	 * Run app
	 * void -> void
	 */	
	public void beginApp() {
		
		Guest hulkFan = new Guest();
		Guest spidermanFan = new Guest();
		Guest rideFan = new Guest();		
	}
	
	
	
	/*
	 * Pauses app to be more realistic
	 * int -> void
	 */	
	public void pause(int i) { 
		
		try {
			Thread.sleep(i);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}		
	}

}
