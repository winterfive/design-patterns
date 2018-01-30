package stores;
import pizza.Pizza;
import client.Downtown;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
	
		pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + "---");		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
	
	// abstract - objects cannot be instantiated, subclasses must do it
	// Pizza - the Product, albeit a vague definition
	// createPizza - the pizza making "factory"
	// type - parameters (or not) to produce variations

}
