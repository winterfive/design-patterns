import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare() {
		System.out.println("Preparing the pizza.");
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
	

}
