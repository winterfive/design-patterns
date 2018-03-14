
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
	
	public void boilWater() {
		System.out.println("Boiling water.");
	}
	
	abstract void brew();
	
	public void pourInCup() {
		System.out.println("Pouring into cup.");
	}

	// this is a hook, a subclass can override this if it wants to
	boolean customerWantsCondiments() {
		return true;
	}

	abstract void addCondiments();

}
