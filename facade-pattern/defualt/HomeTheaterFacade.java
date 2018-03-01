package defualt;

public class HomeTheaterFacade {
	SoundSystem sound;
	Projector projector;
	Lights lights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(SoundSystem sound,
			Projector projector,
			Lights lights,
			Screen screen,
			PopcornPopper popper) {
		
		this.sound = sound;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;		
	}
	
	public void netflixAndChill(String title) {
		System.out.println("Get ready to watch some Netflix...");
		popper.on();
		sound.on();
		sound.setVolume(7);
		lights.off();
		screen.down();
		projector.on();		
	}
	
	public void endWatching() {
		popper.off();
		sound.off();
		lights.on();
		projector.off();
		screen.up();
	}
}
