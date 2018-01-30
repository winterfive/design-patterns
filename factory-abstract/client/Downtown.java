package client;
import pizza.Pizza;
import stores.CHPizzaStore;
import stores.NYPizzaStore;
import stores.PizzaStore;

public class Downtown {
	
	public static void main(String[] args) {
		
		Downtown myDowntown = new Downtown();
		myDowntown.eatPizza();
	}
	
	public void eatPizza() {
		
		// Create two pizza stores
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new CHPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
