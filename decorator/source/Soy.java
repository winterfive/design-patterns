package source;

public class Soy extends condimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;		
	}
	
	public String getDesc() {
		return beverage.getDesc() + " Soy";
	}
	
	public double cost() {
		return beverage.cost() + .15;
	}

}
