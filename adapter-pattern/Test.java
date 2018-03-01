
import java.util.Vector;
import java.util.Arrays;

public class Test {
	public static void main (String args[]) {
		Vector<String> v = new Vector<String>(Arrays.asList(args));
		EnumerationIterator iterator = new EnumerationIterator(v.elements());
		
		// Add content to vector
		for(int i = 0; i < 5; i++) {
			v.add(Integer.toString(i + 1));
		}
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}