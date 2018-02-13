package commands;

public class MacroCommand implements Command{
	Command[] commands;
	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	public void undo() {
		int size = commands.length;
		for(int i = 0; i < size; i++) {
			commands[i].execute();
		}		
	}
}
