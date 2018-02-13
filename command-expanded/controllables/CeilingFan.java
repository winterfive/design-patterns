package controllables;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MED = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
	
	public CeilingFan(String location, int speed) {
		super();
		this.location = location;
		speed = OFF;	 // default speed
	}
	
	public void high() {
		speed = HIGH;
		System.out.println("The fan is spinning at high speed.");
	}
	
	public void medium() {
		speed = MED;
		System.out.println("The fan is on medium.");
	}
	
	public void low() {
		speed = LOW;
		System.out.println("The fan is on low speed.");
	}
	
	public void off() {
		speed = OFF;
		System.out.println("The fan is off.");
	}
	
	public int getSpeed() {
		return speed;
	}
}
