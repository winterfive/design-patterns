package pizza;

import factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
	// pif = pizzaIngredientfactory
	PizzaIngredientFactory pif;
	
	public CheesePizza(PizzaIngredientFactory pif) {
		this.pif = pif;
	}
	
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = pif.createDough();
		sauce = pif.createSauce();
		cheese = pif.createCheese();
	}
}
