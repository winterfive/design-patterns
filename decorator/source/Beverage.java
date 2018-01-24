package source;

public abstract class Beverage {
	public enum Size { TALL, GRANDE, VENTI };
	
	// Default drink info
	Size size = Size.TALL;
	String desc = "Unknown Beverage";
  
	public String getDescription() {
		return desc;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}
 
	public abstract double cost();
}