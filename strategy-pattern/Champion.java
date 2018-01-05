public class Champion implements AttackBehavior, TauntBehavior {
	
	AttackBehavior attackBehavior;
	TauntBehavior tauntBehavior;
	
	public Champion() {}
	
	/*
	 * Champion object retreats from a fight
	 * String -> void
	 */
	void retreat(String champType) {
		System.out.println("The " + champType + " is retreating to safety.");
	}

	public void taunt() {
		tauntBehavior.taunt();		
	}

	public void attack() {
		attackBehavior.attack();
		
	}
}
