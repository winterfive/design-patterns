package source;

public class Soy extends CondimentDecorator{
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;		
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		double cost = beverage.cost();
		Size size = beverage.getSize();
		if(size == Size.TALL) {
			cost += .30;
		} 
		if(size == Size.GRANDE) {
			cost += .45;
		}
		if(size == Size.VENTI) {
			cost += .60;
		}
		return cost;
	}

}
