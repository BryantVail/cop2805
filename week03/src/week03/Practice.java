package week03;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		Store store = new Store();
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.print("Enter command (h for help): ");
			String command = input.nextLine();
			switch(command.toLowerCase()) {
			case "h" :
				System.out.print("L - display list of products");
				System.out.print("A - add a product");
				System.out.print("D - Delete a product");
				System.out.print("P - record a purchase");
				System.out.print("Q - Quit program");
				break;
			case "l":
				for(Product product : store.getProducts()) {
					System.out.print(product);
				}
				break;
			case "a": 
				System.out.print("Enter product name: ");
				String name = input.nextLine();
				System.out.print("Enter product price: ");
				double price = input.nextDouble();
				System.out.print("Yes");
				break;
			case "d":
				System.out.println("Enter product id to delete: ");
				int id = input.nextInt();
				store.removeProduct(id);
				break;
			case "p": 
				
			}
		}while(true)
	}
	

}
