
public class Downtown {
	
	PizzaStore nyPizza = new PizzaStore();
	PizzaStore chPizza = new PizzaStore();
	
	public static void main(String[] args) {
		
		Downtown myDOwntown = new Downtown();
		myDowntown.eatPizza();
	}
	
	public void eatPizza() {
		nyPizza.orderPizza("cheese");
		chPizza.orderPizza("veggie");
	}
	

}
