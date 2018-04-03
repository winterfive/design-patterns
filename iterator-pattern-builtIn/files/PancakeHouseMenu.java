package files;
import java.util.ArrayList;

public class PancakeHouseMenu {
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("Blueberry Pankcakes", 
				"A stack of three pancakes with fresh blueberries", 
				true, 
				12.99);
		
		addItem("Regular Pancakes",
				"A stack of three pancakes with real maple syrup",
				true,
				10.99);
		
		addItem("Chedder Grits with Bacon or Sausage",
				"A bowl of Carolina Gold grits with Sharp chedder, butter, choice of bacon or sausage",
				false,
				8.99);
		
		addItem("Bacon or Sauasage and Eggs",
				"Two farm fresh eggs with choice of bacon or sausage",
				false,
				8.99);		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		menuItems.add(item);		
	}
	
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}

}
