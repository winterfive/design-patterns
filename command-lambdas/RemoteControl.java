public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl() {
		// Magic numbers... 
		onCommands = new Command[9];
		offCommands = new Command[9];
		
		for(int i = 0; i < 9; i++) {
			// by default each slot on the remote will have 
			// a noCommand lambda
			onCommands[i] = () -> {};
			offCommands[i] = () -> {};
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot]= onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n----- Remote Control -----\n");
		int size = onCommands.length;
		for(int i = 0; i < size; i++) {
			sb.append("[slot " + i + "] " + onCommands[i].getClass().getName()
			+ "    " + offCommands[i].getClass().getName() + "\n");
			
		}
		return sb.toString();
	}
}
