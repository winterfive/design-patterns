package pizza;

import factories.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory pif;
	
	public PepperoniPizza(PizzaIngredientFactory pif) {
		this.pif = pif;
	}
	
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = pif.createDough();
		sauce = pif.createSauce();
		cheese = pif.createCheese();
		pepperoni = pif.createPepperoni();
	}	
}
