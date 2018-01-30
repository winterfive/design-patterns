package stores;
import factories.NYPizzaIngredientFactory;
import factories.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import pizza.VeggiePizza;

public class CHPizzaStore extends PizzaStore{
	
	// A PizzaStore franchise in Chicago
	
	public Pizza createPizza(String item) {
		
			Pizza pizza = null;
			PizzaIngredientFactory pif = new NYPizzaIngredientFactory();
			
			if(item.equals("cheese")) {
				pizza = new CheesePizza(pif);
				pizza.setName("Chicago Style Cheese Pizza");
			}
			else if(item.equals("veggie")) {
				pizza = new VeggiePizza(pif);
				pizza.setName("Chicago Style Veggie Pizza");
			}
			else if(item.equals("pepperoni")) {
				pizza = new PepperoniPizza(pif);
				pizza.setName("Chicago Style Pepperoni Pizza");
			}
			return pizza;
		}
	}
