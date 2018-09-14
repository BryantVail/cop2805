package week03;

public class Product {
	private static int nextId = 0;
	public int id;
	public String name; // product name
	public double price;
	public int inventory;
	
	public Product(String name, double price, int inventory) {
		this.name = name;
		this.price = price;
		this.inventory = inventory;
		this.id = nextId++;
	}
	
	@Override
	public String toString() {
		return ("id: " + id + ", name : "+name+", price: $" + price + ", " + inventory + " available.");
	}
	

}
