package stores;
import factories.NYPizzaIngredientFactory;
import factories.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
	
	// A PizzaStore franchise in NYC
	
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory pif = new NYPizzaIngredientFactory();
		
		if(item.equals("cheese")) {
			pizza = new CheesePizza(pif);
			pizza.setName("NY Style Cheese Pizza");
		}
		else if(item.equals("veggie")) {
			pizza = new VeggiePizza(pif);
			pizza.setName("NY Style Veggie Pizza");
		}
		else if(item.equals("pepperoni")) {
			pizza = new PepperoniPizza(pif);
			pizza.setName("NY Style Pepperoni Pizza");
		}
		return pizza;
	}
}
