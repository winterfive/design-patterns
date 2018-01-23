package source;

public class Expresso extends Beverage{
	
	public Expresso() {
		desc = "Expresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
