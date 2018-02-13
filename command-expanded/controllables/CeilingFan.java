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
	}
	
	public void medium() {
		speed = MED;
	}
	
	public void low() {
		speed = LOW;
	}
	
	public void off() {
		speed = OFF;
	}
	
	public int getSpeed() {
		return speed;
	}
}
