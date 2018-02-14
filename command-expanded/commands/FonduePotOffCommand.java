package commands;

import controllables.FonduePot;

public class FonduePotOffCommand implements Command {
	FonduePot fp;
	
	public FonduePotOffCommand(FonduePot fp) {
		this.fp = fp;
	}
	
	public void execute() {
		fp.off();
		
	}
	public void undo() {
		fp.on();
	}
}
