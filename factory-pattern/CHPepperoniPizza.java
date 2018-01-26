
public class CHPepperoniPizza extends Pizza {
	
	public CHPepperoniPizza() {
		name = "Chicago Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Pplum Tomato Sauce";
		
		toppings.add("Shredded Mozarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
		
	}
	
	void cut() {
		System.out.println("Cutting the pizza into square slices.");
	}

}
