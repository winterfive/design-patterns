
public class CHPizzaStore {
	
	// A PizzaStore franchise in Chicago
	
	public Pizza createPizza(type) {
		
		if(item.equals("cheese")) {
			return new CHCheesePizza();
		}
		else if(item.equals("pepperoni")) {
			return new CHPepperoniPizza();
		}
		else if(item.equals("veggie")) {
			return new CHVeggiePizza();
		} else {
			return null;
		}
	}

}
