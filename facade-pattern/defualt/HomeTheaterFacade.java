package defualt;

public class HomeTheaterFacade {	
	SoundSystem sound = new SoundSystem();
	Projector projector = new Projector();
	Lights lights = new Lights();
	Screen screen = new Screen();
	PopcornPopper popper = new PopcornPopper();
	
	void turnOn(String movie, int volume) {
		popper.on();
		lights.off();
		screen.down();
		sound.on();
		sound.setVolume(volume);
		projector.on();
		System.out.println("We're ready to watch " + movie + "!\n");
	}
	
	void turnOff() {
		System.out.println("The movie is over.");
		popper.off();
		lights.on();
		screen.up();
		sound.off();
		projector.off();
	}	
	
}
