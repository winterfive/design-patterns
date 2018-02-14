package commands;

import controllables.HotTub;

public class HotTubOffCommand implements Command{
	HotTub ht;	

	public HotTubOffCommand(HotTub ht) {
		this.ht = ht;		
	}

	public void execute() {
		ht.off();		
	}

	public void undo() {
		ht.on();
	}
}
