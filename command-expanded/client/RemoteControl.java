package client;

import commands.*;

public class RemoteControl {
	Command slot;
	public RemoteControl() {}
	
	/*
	 * Sets the command that will be executed
	 * when the button on the remote is pressed
	 */
	public void setCommand(Command command) 	{
		slot = command;
	}
	
	/*
	 * Button is pressed so the command loaded
	 * into slot is executed.
	 */
	public void buttonWasPressed() {
		slot.execute();
	}

}
