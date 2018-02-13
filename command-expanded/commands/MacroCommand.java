package commands;

public class MacroCommand implements Command{
	Command[] commands;
	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	public void execute() {
		int size = commands.length;
		for(int i = 0; i < size; i++) {
			commands[i].execute();
		}		
	}

	public void undo() {
				
	}
}
