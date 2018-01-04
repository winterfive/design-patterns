class Champion implements AttackBehavior, TauntBehavior {
	
	AttackBehavior attackBehavior;
	TauntBehavior tauntBehavior;
	
	public Champion() {}
	
	void retreat(String champType) {
		System.out.println("The " + champType + " is retreating to safety.");
	}
	
}
