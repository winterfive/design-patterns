import java.util.*;

public class EnumIterator implements Iterator<Object>{
	Enumeration<?> enumeration;
	
	public EnumIterater(Enumeration<?> enumeration) {
		this.enumeration = enumeration;
	}

	public boolean hasNext() {
		return enumeration.hasNextElement();		
	}
	
	public Object next() {
		return enumeration.nextElement();		
	}
	
	public void remove() {
		throw new UnsupportedOperationException();		
	}
}
