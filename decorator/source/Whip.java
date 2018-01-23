package source;

public class Whip extends condimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;		
	}
	
	public String getDesc() {
		return beverage.getDesc() + " Whip";
	}
	
	public double cost() {
		return .30;
	}

}