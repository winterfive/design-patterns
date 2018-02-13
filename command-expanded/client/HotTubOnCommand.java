package client;

import commands.Command;
import controllables.HotTub;

public class HotTubOnCommand implements Command{
	HotTub ht;

	public void execute() {
		ht.on();		
	}

	public void undo() {	}
	

}
