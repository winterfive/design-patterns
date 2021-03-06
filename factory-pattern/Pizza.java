import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare() {
		System.out.println("Prepare " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
}
	}
	
	void bake() {
		System.out.println("Baking the pizza.");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into slices.");
	}
	
	void box() {
		System.out.println("Placing the pizza in a box.");
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
}
	

}
