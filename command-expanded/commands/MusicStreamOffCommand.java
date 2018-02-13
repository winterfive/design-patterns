package commands;

public class MusicStreamOffCommand implements Command{
	MusicStream ms;	

	public MusicStreamOffCommand(MusicStream ms) {
		this.ms = ms;
	}

	public void execute() {
		System.out.println("The music is off.");
	}

}
