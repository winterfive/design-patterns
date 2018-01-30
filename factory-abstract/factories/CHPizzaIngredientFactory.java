package factories;
import ingredients.BlackOlives;
import ingredients.Cheese;
import ingredients.Dough;
import ingredients.Eggplant;
import ingredients.MozzarellaCheese;
import ingredients.Pepperoni;
import ingredients.PlumTomatoSauce;
import ingredients.Sauce;
import ingredients.SlicedPepperoni;
import ingredients.Spinach;
import ingredients.ThickCrustDough;
import ingredients.Veggie;
import ingredients.Veggies;

public class CHPizzaIngredientFactory implements PizzaIngredientFactory {
	Veggie veggies[];
	

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

}