package client;

import commands.*;
import controllables.*;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		RemoteControl remote = new RemoteControl();
		
		Light livingRoomLight = new Light("living room");
		Light kitchenLight = new Light("kitchen");		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);		
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		GarageDoor gDoor = new GarageDoor();
		Light gLight = new Light("garage");
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(gDoor);
		GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(gDoor);
		LightOnCommand garageLightOn = new LightOnCommand(gLight);
		LightOffCommand garageLightOff = new LightOffCommand(gLight);
		
		MusicStream ms = new MusicStream();
		MusicStreamOnCommand mson = new MusicStreamOnCommand(ms);
		MusicStreamOffCommand msoff = new MusicStreamOffCommand(ms);
		
		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, garageOpen, garageClose);
		remote.setCommand(3, garageLightOn, garageLightOff);
		remote.setCommand(4, mson, msoff);
		// Slots 5, 6, 7 have noCommand via RemoteControl() constructor
		
		System.out.println(remote);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.undoButtonWasPushed();	// Turns light back on
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		remote.onButtonWasPushed(2);
		remote.offButtonWasPushed(2);
		remote.onButtonWasPushed(3);
		remote.offButtonWasPushed(3);
		remote.onButtonWasPushed(4);
		remote.offButtonWasPushed(4);
	}
}
