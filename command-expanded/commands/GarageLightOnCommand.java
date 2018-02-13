package commands;
import controllables.*;

public class GarageLightOnCommand implements Command{
	
	GarageLight gl;
	
	public GarageLightOnCommand(GarageLight gl) {
		this.gl = gl;
	}

	public void execute() {
		gl.garageLightOn();		
	}
}
