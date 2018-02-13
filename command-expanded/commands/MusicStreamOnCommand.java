package commands;

public class MusicStreamOnCommand implements Command{
	MusicStream ms;
	
	public MusicStreamOnCommand(MusicStream ms) {
		this.ms = ms;
	}

	public void execute() {
		ms.On();
		ms.adjustVolume();
		
	}

}
