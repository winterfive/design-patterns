

public class Knight extends Champion{
	
	public Knight() {
		attackBehavior = new MeleeAttack();
		tauntBehavior = new MeleeTaunt();
	}
	
	/*
	 * Knight retreats from a fight
	 * String -> void
	 */
	public void retreat() {
		System.out.println("The Knight is retreating to safety.");
	}
}
