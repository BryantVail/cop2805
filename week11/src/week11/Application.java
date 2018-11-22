package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		ArrayList<Genre> genres = new ArrayList<>(10);
		//seed genres
		genres.add(new Genre("Romantic Comedy"));
		genres.add(new Genre("Comedy"));
		genres.add(new Genre("Action"));
		genres.add(new Genre("Documentary"));
		genres.add(new Genre("Drama"));
		
		ArrayList<Movie> titles = new ArrayList<>();
		//seed titles
		titles.add(new Movie("The Last jedi"));
		titles.add(new Movie("Rudy"));
		titles.add(new Movie("Cars"));
		titles.add(new Movie("Toy Story"));
		titles.add(new Movie("Forrest Gump"));
		titles.add(new Movie("Bruce Almighty"));
		
		ArrayList<Customer> customers = new ArrayList<>();
		//seed customers
		customers.add(new Customer("Bry@email.com"));
		customers.add(new Customer("John@email.com"));
		customers.add(new Customer("Lewie@email.com"));
		customers.add(new Customer("Shirley@email.com"));
		customers.add(new Customer("Lewis@email.com"));
		customers.add(new Customer("Mom@email.com"));
		
		
		
		Scanner intInput = new Scanner(System.in);
		int currentInput = (Integer) null;
		currentInput = intInput.nextInt();
		
		
		
		
		
		
	}
	
	class StoreUser{
		public Customer findCustomer(ArrayList<Customer> customers, String customerSearchParameter) {
			
		}
		
		public Customer initCheckoutCustomer(String email) {
			if(customers.contains(email)) {
				
			}
			
			
			
			
			switch(email) {
			
				case 0: {
					System.out.println("enter email to search customer");
					currentInput = intInput.nextInt();
					break;
				}
				case 1: {
					System.out.println("enter customerId to search customer");
					break;
				}
				case 2:{
					System.out.println("Enter customer email to create new customer account");
					break;
				}
			
			}//end switch
		}
	}
	
	
	
}
