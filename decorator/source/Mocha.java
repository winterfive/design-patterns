package source;

public class Mocha extends CondimentDecorator{
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public double cost() {
		double cost = beverage.cost();
		Size size = beverage.getSize();
		if(size == Size.TALL) {
			cost += .20;
		} 
		if(size == Size.GRANDE) {
			cost += .30;
		}
		if(size == Size.VENTI) {
			cost += .45;
		}
		return cost;
	}
}
