package client;

import commands.*;
import controllables.*;
import controllables.GarageLight;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		RemoteControl remote = new RemoteControl();
		
		Light livingRoomLight = new Light();
		Light kitchenLight = new Light();		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);		
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		GarageDoor gDoor = new GarageDoor();
		GarageLight gLight = new GarageLight();
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(gDoor);
		GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(gDoor);
		GarageLightOnCommand garageLightOn = new GarageLightOnCommand(gLight);
		GarageLightOnCommand garageLightOff = new GarageLightOnCommand(gLight);
		
		MusicStream ms = new MusicStream();
		MusicStreamOnCommand mson = new MusicStreamOnCommand(ms);
		MusicStreamOffCommand msoff = new MusicStreamOffCommand(ms);
		
		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, garageOpen, garageClose);
		remote.setCommand(3, garageLightOn, garageLightOff);
		remote.setCommand(4, mson, msoff);
	}

}
