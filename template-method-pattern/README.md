## Template Method Pattern

The template method pattern lets you create a template for an algorithm in which each step is a method.
Some of those methods are handled by the parent class and others by the child class (these should be labeled abstract).

Like a recipe with several steps but some are optional (adding walnuts).

![Cookie recipe with optional walnuts or pecans](https://user-images.githubusercontent.com/22779199/37430436-7c50bb9a-27a8-11e8-829a-d85af8d4ebf7.jpg)  

The parent class with the algorithm (a final method).


    public abstract class Beverage {
	
		// final - we don't want the subclasses to be able to change this
		final void prepareRecipe() {
			boilWater();
			brew();
			pourInCup();
			if(customerWantsCondiments()) {
				addCondiments();
			}
		}

		public void boilWater() {
			System.out.println("Boiling water.");
		}

		abstract void brew();

		public void pourInCup() {
			System.out.println("Pouring into cup.");
		}

		abstract void addCondiments();
		
		// a hook - a subclass can override, or not
		boolean customerWantsCondiments() {
			return true;
		}
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

