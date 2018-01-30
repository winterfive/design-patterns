package factories;
import java.util.ArrayList;

import ingredients.Cheese;
import ingredients.Dough;
import ingredients.Garlic;
import ingredients.MarinaraSauce;
import ingredients.Mushroom;
import ingredients.Onion;
import ingredients.Pepperoni;
import ingredients.RedPepper;
import ingredients.ReggianoCheese;
import ingredients.Sauce;
import ingredients.SlicedPepperoni;
import ingredients.ThinCrustDough;
import ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

}
