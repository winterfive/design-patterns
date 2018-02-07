package client;
import commands.Command;

/*
 * A single button remote control
 * that has a method (setCommand()) that
 * allows the thing that is controlled to be changed.
 */
public class SimpleRemoteControl {
	Command slot;
	public SimpleRemoteControl() {}
	
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
