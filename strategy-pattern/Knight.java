
public class Knight extends Champion{
	
	public Knight() {
		attackBehavior = new MeleeAttack();
		tauntBehavior = new MeleeTaunt();
	}
}
