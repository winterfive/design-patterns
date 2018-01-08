
public class Battlefield {
	
	Mage magicUser = new Mage();
	Knight meleeFighter = new Knight();
	
	public void startBattle() {
		
		magicUser.taunt();
		meleeFighter.taunt();
		
		magicUser.attack();
		meleeFighter.attack();
	
		magicUser.retreat();
		meleeFighter.retreat();
	}
	
	public static void main(String[] args) {
		
		Battlefield myField = new Battlefield();
		myField.startBattle();		
	}
}
