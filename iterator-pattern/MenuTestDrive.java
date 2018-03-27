
public class MenuTestDrive {

	public static void main(String[] args) {
		PancakeHouseMenu phm = new PancakeHouseMenu();
		DinerMenu dm = new DinerMenu();
		
		Waitress waitress = new Waitress(phm, dm);
		waitress.printMenu();

	}

}
