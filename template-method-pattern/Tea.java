
public class Tea extends Beverage{
	
	void prepareRecipe() {
		steepTeaBag();
		addLemon();
	}

	private void addLemon() {
		System.out.println("Adding lemon.");
		
	}

	private void steepTeaBag() {
		System.out.println("Steeping a teabag.");
		
	}
	

}
