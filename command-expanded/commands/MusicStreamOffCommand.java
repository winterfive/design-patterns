package commands;

import controllables.MusicStream;

public class MusicStreamOffCommand implements Command{
	MusicStream ms;	

	public MusicStreamOffCommand(MusicStream ms) {
		this.ms = ms;
	}

	public void execute() {
		System.out.println("The music is off.");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
