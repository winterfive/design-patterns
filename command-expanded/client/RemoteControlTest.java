package client;

import commands.*;
import controllables.*;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		RemoteControl remote = new RemoteControl();
		
		Light livingRoomLight = new Light("living room");	
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		Light kitchenLight = new Light("kitchen");	
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		GarageDoor gDoor = new GarageDoor();		
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(gDoor);
		GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(gDoor);
		
		Light gLight = new Light("garage");
		LightOnCommand garageLightOn = new LightOnCommand(gLight);
		LightOffCommand garageLightOff = new LightOffCommand(gLight);
		
		MusicStream music = new MusicStream();
		MusicStreamOnCommand musicOn = new MusicStreamOnCommand(music);
		MusicStreamOffCommand musicOff = new MusicStreamOffCommand(music);
		
		CeilingFan bedroomFan = new CeilingFan("master bedroom", 0);		
		FanMediumCommand bedroomFanMed = new FanMediumCommand(bedroomFan);
		FanHighCommand bedroomFanHigh = new FanHighCommand(bedroomFan);
		FanOffCommand bedroomFanOff = new FanOffCommand(bedroomFan);
		
		CeilingFan kFan = new CeilingFan("kitchen", 0);
		FanLowCommand kitchenFanLow = new FanLowCommand(kFan);
		FanOffCommand kitchenFanOff = new FanOffCommand(kFan);
		
		// Macro for Party Mode
		
		Light strobeLight = new Light("party room");
		MusicStream partyMusic = new MusicStream();
		HotTub hotTub = new HotTub();
		FonduePot fonduePot = new FonduePot("Gruyere, Cheddar, and Emmentaler");
		
		LightOnCommand strobeLightOn = new LightOnCommand(strobeLight);
		LightOffCommand strobeLightOff = new LightOffCommand(strobeLight);
		MusicStreamOnCommand partyMusicStreamOn = new MusicStreamOnCommand(partyMusic);
		MusicStreamOffCommand partyMusicStreamOff = new MusicStreamOffCommand(partyMusic);
		HotTubOnCommand hotTubOn = new HotTubOnCommand(hotTub);
		HotTubOffCommand hotTubOff = new HotTubOffCommand(hotTub);
		FonduePotOnCommand fonduePotOn = new FonduePotOnCommand(fonduePot);
		FonduePotOffCommand fonduePotOff = new FonduePotOffCommand(fonduePot);
		
		Command[] partyOn = { strobeLightOn, partyMusicStreamOn, fonduePotOn, hotTubOn };
		Command[] partyOff = { strobeLightOff, partyMusicStreamOff, fonduePotOff, hotTubOff };
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
			
		// Remote
		
		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, garageOpen, garageClose);
		remote.setCommand(3, garageLightOn, garageLightOff);
		remote.setCommand(4, bedroomFanMed, bedroomFanOff);
		remote.setCommand(5, bedroomFanHigh, bedroomFanOff);
		remote.setCommand(6, kitchenFanLow, kitchenFanOff);
		remote.setCommand(7, musicOn, musicOff);
		remote.setCommand(8, partyOnMacro, partyOffMacro);
		// Remaining slots have noCommand via RemoteControl() constructor
		
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
		remote.onButtonWasPushed(5);
		remote.offButtonWasPushed(5);
		remote.undoButtonWasPushed();	// Turns master bedroom fan back on at high speed
		remote.onButtonWasPushed(6);
		remote.offButtonWasPushed(6);
		remote.undoButtonWasPushed();	// Turns kitchen fan back on at low speed
		remote.onButtonWasPushed(7);
		System.out.println("\nTurn the party on!");
		remote.onButtonWasPushed(8);
		System.out.println("\nClosing time...you don't have to go home but you can't stay here.");
		remote.offButtonWasPushed(8);
	}
}
