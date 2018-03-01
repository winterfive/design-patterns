package defualt;

public class HomeTheater {
	SoundSystem sound;
	Projector projector;
	Lights lights;
	Screen screen;
	PopcornPopper popper;
	
	void turnOn(String movie, int volume) {
		popper.on();
		lights.off();
		screen.down();
		sound.on();
		sound.setVolume(volume);
		projector.on();
		System.out.println("We're ready to watch " + movie + "!");
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
