package commands;

import controllables.HotTub;

public class HotTubOffCommand implements Command{
	HotTub ht;

	public void execute() {
		ht.off();		
	}

	public void undo() {}
	
	

}
