package defualt;

public class HomeTheaterFacade {
	HomeTheater ht;
	
	void on(String movie, int volume) {
		ht.turnOn(movie, volume);
	}
	
	void off() {
		ht.turnOff();
	}	
	
}
