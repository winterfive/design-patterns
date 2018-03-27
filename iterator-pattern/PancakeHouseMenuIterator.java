import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
	ArrayList<MenuItem> items;
	int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	public boolean hasNext() {
		if(items.get(position) == null || position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}

	public MenuItem next() {
		MenuItem item = items.get(position);
		position++;
		return item;
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}
}
