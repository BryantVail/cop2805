package week03;

import java.util.ArrayList;

public class Store {
	
	private ArrayList<Product> products = new ArrayList<>();
	
	public ArrayList<Product> getProducts(){
		return products;
	}
	
	public void addProduct(Product newProduct) {
		products.add(newProduct);
	}
	
	public void removeProduct(int productId) {
		//products.remove(productId);
		for(Product product : products) {
			if(product.id == productId) {
				products.remove(product);
				return;
			}
		}
		
	}
	
	public void recordPurchase(int productId, int quantityPurchased) {
		//to do, decrement inventory for the product
		for(Product product : products) {
			if(product.id == productId) {
				product.inventory -= quantityPurchased;
			}
		}
		
	}

}
