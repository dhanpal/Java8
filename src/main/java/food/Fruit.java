package food;

public abstract class Fruit {

	private String name;
	
	private String price;
	
	public abstract String getName();
	
	public abstract String getPrice();
	
	public abstract void setName(String name);
	
	public abstract void setPrice(String price);
}
