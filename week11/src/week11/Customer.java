package week11;

public class Customer {
	
	private static int nextId = 100101;
	
	public String email;
	public String firstName;
	public String lastName;
	public Order currentOrder;

	private int customerId;
//	public ArrayList<String>
	
	public Customer(String email) {
		this.email = setEmail(email);
		this.customerId = nextId++;
		
	}
	
	private String setEmail(String email) {
		if(/*regEx == true*/email != null) {
			this.email = email;
			return this.email;
		}
		return null;
	}
	

}
