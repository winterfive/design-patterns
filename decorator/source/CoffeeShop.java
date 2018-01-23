package source;

public class CoffeeShop {

	public static void main(String[] args) {
		Beverage bev1 = new Expresso();
		System.out.println(bev1.getDesc() + bev1.getSize() + " $ " + bev1.cost());
		
		Beverage bev2 = new HouseBlend();
		bev2 = new Mocha(bev2);
		bev2 = new Mocha(bev2);
		bev2 = new Whip(bev2);
		System.out.println(bev2.getDesc() + bev2.getSize() + " $ " + bev2.cost());
		
		Beverage bev3 = new Decaf();
		bev3 = new Soy(bev3);
		System.out.println(bev3.getDesc() + bev3.getSize() + " $ " + bev3.cost());
	}

}
