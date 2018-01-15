package strategy;
public abstract class Champion implements AttackBehavior, TauntBehavior {
	
	AttackBehavior attackBehavior;
	TauntBehavior tauntBehavior;
	
	public Champion() {}
	
	public void taunt() {
		tauntBehavior.taunt();		
	}

	public void attack() {
		attackBehavior.attack();		
	}
	
	public void retreat() {}
}
