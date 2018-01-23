package source;

public class Mocha extends condimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDesc() {
		return beverage.getDesc() + " Mocha";
	}
	
	public double cost() {
		return beverage.cost() + .20;
	}
	

}
