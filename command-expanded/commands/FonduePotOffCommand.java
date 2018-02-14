package commands;

import controllables.FonduePot;

public class FonduePotOffCommand implements Command {
	FonduePot fp;
	
	public void execute() {
		fp.off();
		
	}
	public void undo() {}
	

}
