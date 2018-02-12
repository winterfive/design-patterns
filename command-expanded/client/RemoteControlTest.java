package client;

import commands.*;
import controllables.*;
import controllables.GarageLight;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		GarageDoor gDoor = new GarageDoor();
		GarageLight gLight = new GarageLight();
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(gDoor);
		GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(gDoor);
		GarageLightOnCommand garageLightOn = new GarageLightOnCommand(gLight);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(lightOff);
		remote.buttonWasPressed();
		
		remote.setCommand(garageClose);
		remote.buttonWasPressed();
		
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
		
		remote.setCommand(garageLightOn);
		remote.buttonWasPressed();
	}

}
