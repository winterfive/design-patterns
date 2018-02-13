package commands;

import controllables.MusicStream;

public class MusicStreamOnCommand implements Command{
	MusicStream ms;
	
	public MusicStreamOnCommand(MusicStream ms) {
		this.ms = ms;
	}

	public void execute() {
		ms.On();
		ms.adjustVolume();
		
	}
	
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
