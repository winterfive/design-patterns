package commands;

import controllables.FonduePot;

public class FonduePotOnCommand implements Command{
	FonduePot fp;
	
	public FonduePotOnCommand(FonduePot fp) {
		this.fp = fp;
	}

	public void execute() {
		fp.on();		
	}

	public void undo() {
		fp.off();
	}
}
