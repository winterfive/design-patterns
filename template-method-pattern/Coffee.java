
public class Coffee extends Beverage {
	
	void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	private void addSugarAndMilk() {
		System.out.println("Adding sugar and milk.");
	}

	private void brewCoffeeGrinds() {
		System.out.println("Coffee dripping through filter");
	}

}
