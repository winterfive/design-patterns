
public class CHCheesePizza extends Pizza {
	
	public CHCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozarella Cheese");		
	}
	
	void cut() {
		System.out.println("Cutting the pizza into square slices.");
	}

}
