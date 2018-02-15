package client;

import commands.*;
import controllables.*;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		RemoteControl remote = new RemoteControl();
		
		Light livingRoomLight = new Light("living room");	
		
		Light kitchenLight = new Light("kitchen");	
		
		Light gLight = new Light("garage");
			
		// Remote
		
		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, garageLightOn, garageLightOff);
		// Remaining slots have noCommand via RemoteControl() constructor
		
		System.out.println(remote);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.undoButtonWasPushed();	// Turns light back on
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		remote.onButtonWasPushed(2);
		remote.offButtonWasPushed(2);
	}
}
