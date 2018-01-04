
public class Mage extends Champion{
	
	public Mage() {
		attackBehavior = new RangedAttack();
		tauntBehavior = new RangedTaunt();
	}
	
	public void commenceAttack() {
		attackBehavior.attack();
	}
	
	public void expressTaunt() {
		tauntBehavior.taunt();
	}

}
