package commands;

import controllables.*;

public class GarageLightOffCommand implements Command{
	
	GarageLight gl = new GarageLight();	

	public GarageLightOffCommand(GarageLight gl) {
		this.gl = gl;
	}

	public void execute() {
		gl.garageLightOff();		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
