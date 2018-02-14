package commands;

import controllables.HotTub;

public class HotTubOnCommand implements Command{
	HotTub hottub;	

	public HotTubOnCommand(HotTub ht) {
		this.hottub = ht;
	}

	public void execute() {
		hottub.on();		
	}

	public void undo() {	}
	

}
