package commands;

import controllables.CeilingFan;

public class FanMediumCommand implements Command{
	CeilingFan cf;
	int prevSpeed;
	
	public FanMediumCommand(CeilingFan cf) {
		this.cf = cf;
	}

	public void execute() {
		prevSpeed = cf.getSpeed();
		cf.high();		
	}

	public void undo() {
		if(prevSpeed == CeilingFan.HIGH) {
			cf.high();
		} 
		else if(prevSpeed == CeilingFan.MED) {
			cf.medium();
		}
		else if(prevSpeed == CeilingFan.LOW) {
			cf.low();
		}
		else if(prevSpeed == CeilingFan.OFF) {
			cf.off();
		}		
	}

}
