
public class NYPizzaStore extends PizzaStore {
	
	// A PizzaStore franchise in NYC
	
	public Pizza createPizza(String item) {
		
		if(item.equals("cheese")) {
			return new NYCheesePizza();
		}
		else if(item.equals("pepperoni")) {
			return new NYPepperoniPizza();
		}
		else if(item.equals("veggie")) {
			return new NYVeggiePizza();
		} else {
			return null;
		}
	}

}
