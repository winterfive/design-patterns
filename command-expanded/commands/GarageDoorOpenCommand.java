package commands;
import controllables.GarageDoor;

public class GarageDoorOpenCommand implements Command{

	GarageDoor gDoor;
	
	public GarageDoorOpenCommand(GarageDoor gDoor) {
		this.gDoor = gDoor;
	}
	
	public void execute() {
		gDoor.open();	
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	
}
