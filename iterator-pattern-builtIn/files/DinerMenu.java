package files;

import java.util.Iterator;

public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Meatloaf",
				"A mix with beef, veal, and pork, topped with a tomato sauce",
				false,
				12.99);
		
		addItem("BLT",
				"Bacon, lettuce, and tomato sandwich",
				false,
				7.99);
		
		addItem("French Onion Soup",
				"A rich beef and onion broth topped with melted Gruyere cheese and served with crusty French bread",
				false,
				6.99);
		
		addItem("House Salad",
				"Fresh greens topped with tomatoes, red onion, cucumbers, and carrots, choice of dressing",
				true,
				6.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, the menu is full.");
		} else {
			menuItems[numberOfItems] = item;
			numberOfItems++;
		}
	}
	
	public DinerMenuIterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
