package commands;
import controllables.Light;

public class LightOnCommand implements Command {
	
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public LightOnCommand(String string) {
		// TODO Auto-generated constructor stub
	}

	public void execute() {
		light.on();
	}

}
