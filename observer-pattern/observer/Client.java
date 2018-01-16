package observer;
public class Client {

	public static void main(String[] args) {
		
		Client myClient = new Client();
		myClient.begin();
	}
	
	public void begin() {
		RideData rd = new RideData();
		rd.setWaitTimes(30, 45, 75);
	}

}
