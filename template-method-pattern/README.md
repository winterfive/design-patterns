## Template Method Pattern

The template method pattern lets you create a template for an algorithm in which each step is a method.
Some of those methods are handled by the parent class and others by the child class (these should be labeled abstract).

The parent class with the algorithm (a final method).


    public abstract class Beverage {
	
		// final - we don't want the subclasses to be able to change this
		final void prepareRecipe() {
			boilWater();
			brew();
			pourInCup();
			addCondiments();
		}

		public void boilWater() {
			System.out.println("Boiling water.");
		}

		abstract void brew();

		public void pourInCup() {
			System.out.println("Pouring into cup.");
		}

		abstract void addCondiments();
    }
    
The child class

	public class Tea extends Beverage{

		void brew() {
			System.out.println("Steeping teabag.");		
		}

		void addCondiments() {
			System.out.println("Adding lemon.");
		}
	}

