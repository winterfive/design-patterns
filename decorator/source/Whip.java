package source;

public class Whip extends CondimentDecorator{
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;		
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	public double cost() {
		double cost = beverage.cost();
		Size size = beverage.getSize();
		if(size == Size.TALL) {
			cost += .30;
		} 
		if(size == Size.GRANDE) {
			cost += .40;
		}
		if(size == Size.VENTI) {
			cost += .50;
		}
		return cost;
	}

}