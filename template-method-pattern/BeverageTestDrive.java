
public class BeverageTestDrive {

	public static void main(String[] args) {
		Tea t = new Tea();
		Coffee c = new Coffee();
		
		System.out.println("Making tea...");
		t.prepareRecipe();
		
		System.out.println("Brewing coffee...");
		c.prepareRecipe();

	}

}
