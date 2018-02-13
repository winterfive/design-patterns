package controllables;

public class FonduePot {
	String cheese;
	
	public FonduePot(String ch) {
		this.cheese = ch;
	}
	
	public void on() {
		System.out.println("The fondue pot is on and filled with deliscious melted " + cheese + ".");
	}
	
	public void off() {
		System.out.println("The fondue pot is off.");
	}

}
