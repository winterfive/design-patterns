
public class Mage extends Champion{
	
	public Mage() {
		attackBehavior = new RangedAttack();
		tauntBehavior = new RangedTaunt();       
	}
	
	/*
	 * Mage retreats from a fight
	 * String -> void
	 */
	public void retreat() {
		System.out.println("The Mage is retreating to safety.");
	}

}
