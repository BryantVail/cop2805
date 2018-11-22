package week11;

import java.util.ArrayList;

public class Order {

	private static int nextId = 100101;
	public Customer customer;
	public int orderId;
	public ArrayList<Movie> moviesCart;
	
	public Order() {
		this.orderId = Order.nextId++;
		this.customer = null;
		this.moviesCart = new ArrayList<Movie>();
	}
}
