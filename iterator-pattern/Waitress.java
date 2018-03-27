
public class Waitress {
	PancakeHouseMenu phMenu;
	DinerMenu dMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.phMenu = pancakeHouseMenu;
		this.dMenu = dinerMenu;		
	}
	
	public void printMenu() {
		Iterator phIterator = phMenu.createIterator();
		Iterator dIterator = dMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(phIterator);
		System.out.println("\nLUNCH");
		printMenu(dIterator);		
	}
	
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
			}
	}
}