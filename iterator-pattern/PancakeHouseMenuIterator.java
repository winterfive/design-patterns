import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
	ArrayList<MenuItem> menuItems;
	int position = 0;

	public boolean hasNext() {
		if(menuItems.get(position) == null || position >= menuItems.size()) {
			return false;
		} else {
			return true;
		}
	}

	public MenuItem next() {
		MenuItem item = menuItems.get(position);
		position++;
		return item;
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
