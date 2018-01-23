package source;

public abstract class Beverage {
	public enum Size {TALL, GRANDE, VENTI};
	Size size = Size.TALL;
	String desc = "Unknown Beverage";
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public abstract double cost();
}
