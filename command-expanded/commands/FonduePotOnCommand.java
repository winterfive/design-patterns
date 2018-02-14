package client;

import commands.Command;
import controllables.FonduePot;

public class FonduePotOnCommand implements Command{
	FonduePot fp;

	public void execute() {
		fp.on();		
	}

	public void undo() {}
	

}
