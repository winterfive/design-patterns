package pizza;
import ingredients.Cheese;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Veggies;

public abstract class Pizza {
	String name;
	
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Baking the pizza.");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into slices.");
	}
	
	public void box() {
		System.out.println("Placing the pizza in a box.");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		display.append(veggies + "\n");
		return display.toString();
	}	

}
