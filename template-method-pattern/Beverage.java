
public abstract class Beverage {
	
	void prepareRecipe() {
		boilWater();
		pourInCup();
	}

	private void pourInCup() {
		System.out.println("Pouring into cup.");
	}

	private void boilWater() {
		System.out.println("Boiling water.");
	}

}
