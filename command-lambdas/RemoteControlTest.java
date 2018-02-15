public class RemoteControlTest {

	public static void main(String[] args) {
		
		RemoteControl remote = new RemoteControl();
		
		Light livingRoomLight = new Light("living room");		
		Light kitchenLight = new Light("kitchen");		
		Light garageLight = new Light("garage");
			
		// Remote
		
		remote.setCommand(0, () -> { livingRoomLight.on(); }, () -> { livingRoomLight.off(); });
		remote.setCommand(1, () -> { kitchenLight.on(); }, () -> { kitchenLight.off(); });
		remote.setCommand(2, () -> { garageLight.on(); }, () -> { garageLight.off(); });
		remote.setCommand(3, livingRoomLight::on,  livingRoomLight::off); 	// method references
		// Remaining slots have noCommand via RemoteControl() constructor
		
		System.out.println(remote);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		// remote.undoButtonWasPushed();	// Turns light back on
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		remote.onButtonWasPushed(2);
		remote.offButtonWasPushed(2);
		remote.onButtonWasPushed(3);
		remote.offButtonWasPushed(3);
	}
}
