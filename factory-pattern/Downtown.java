
public class Downtown {
	
	PizzaStore nyPizza = new NYPizzaStore();
	PizzaStore chPizza = new CHPizzaStore();
	
	public static void main(String[] args) {
		
		Downtown myDowntown = new Downtown();
		myDowntown.eatPizza();
	}
	
	public void eatPizza() {
		nyPizza.orderPizza("cheese");
		chPizza.orderPizza("veggie");
	}
	

}
