
public class Coffee {
	
	void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	private void addSugarAndMilk() {
		System.out.println("Adding sugar and milk.");
	}

	private void pourInCup() {
		System.out.println("Pouring into cup.");
	}

	private void brewCoffeeGrinds() {
		System.out.println("Coffee dripping through filter");
	}

	private void boilWater() {
		System.out.println("Boiling water.");
	}


}
