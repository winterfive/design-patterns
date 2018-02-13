package commands;
import controllables.GarageDoor;

public class GarageDoorCloseCommand implements Command {
	
	GarageDoor gDoor;
	
	public GarageDoorCloseCommand(GarageDoor gDoor) {
		this.gDoor = gDoor;
	}

	public void execute() {
		gDoor.close();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
