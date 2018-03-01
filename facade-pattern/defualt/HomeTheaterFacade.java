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
	
	

}
