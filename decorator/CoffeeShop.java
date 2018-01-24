package source;

import source.Beverage.Size;

public class CoffeeShop {

	public static void main(String[] args) {
		Beverage bev1 = new Expresso();
		bev1.setSize(Size.GRANDE);
		System.out.println(bev1.getDescription() + " " + bev1.getSize() +
				" $" + String.format("%.2f", bev1.cost()));
		
		Beverage bev2 = new HouseBlend();
		bev2.setSize(Size.VENTI);
		bev2 = new Mocha(bev2);
		System.out.println(bev2.getDescription() + " " + bev2.getSize() +
				" $" + String.format("%.2f", bev2.cost()));
		
		Beverage bev3 = new Decaf();
		bev3.setSize(Size.GRANDE);
		bev3 = new Soy(bev3);
		System.out.println(bev3.getDescription() + " " + bev3.getSize() +
				" $" + String.format("%.2f", bev3.cost()));
	}

}
