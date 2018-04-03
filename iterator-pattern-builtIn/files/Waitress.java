package files;
import java.util.Iterator;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;		
	}
	
	public void printMenu() {
		Iterator<MenuItem> phIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dIterator = dinerMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(phIterator);
		System.out.println("\nLUNCH");
		printMenu(dIterator);		
	}
	
	private void printMenu(Iterator<MenuItem> iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
			}
	}
}
