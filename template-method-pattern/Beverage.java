
public abstract class Beverage {
	
	// final - we don't want the subclasses to be able to change this
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();
		}
				
	}

	// this is a hook, a subclass can override this
	boolean customerWantsCondiments() {
		return true;
	}

	abstract void addCondiments();

	abstract void brew();

	public void pourInCup() {
		System.out.println("Pouring into cup.");
	}

	public void boilWater() {
		System.out.println("Boiling water.");
	}

}
