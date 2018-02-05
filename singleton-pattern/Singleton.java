public class Singleton {
	private static Singleton uniqueInstance;
	private static int count;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		count++;
		return uniqueInstance;
		
	}
	
	public static void main(String[] args) {
		
		Singleton myS = new Singleton();
		myS.begin(myS);		
	}
	
	public void begin(Singleton myS) {
		Singleton.getInstance();
		System.out.println("singleton count: " + this.getCount());
		Singleton.getInstance();
		System.out.println("singleton count: " + this.getCount());
		Singleton.getInstance();
		System.out.println("singleton count: " + this.getCount());
	}
	
	public int getCount() {
		return count;
	}
}

