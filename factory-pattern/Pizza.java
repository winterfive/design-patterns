
public abstract class Pizza {
	
	// All concrete subclasses will implement this abstract class
	
	public void prepare() {
		System.out.println("Preparing the pizza.");
	}
	public void bake() {
		System.out.println("Baking the pizza.");
	}
	public void cut() {
		System.out.println("Cutting the pizza into slices.");
	}
	public void box() {
		System.out.println("Placing the pizza in a box.");
	}
	

}
