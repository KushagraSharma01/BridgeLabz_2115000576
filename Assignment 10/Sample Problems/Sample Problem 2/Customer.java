import java.util.*;
class Customer{
	String name;
	final int customerId;
	List<Product> products;
	
	Customer(String name, int customerId){
		this.name = name;
		this.customerId = customerId;
		products = new ArrayList<>();
	}
	
	public void addProduct(Product p){
		products.add(p);
		System.out.println("The product "+p.name+" is added for customer "+name);
	}
	
	public void displayDetails(){
		System.out.println("Customer name is : "+name);
		System.out.println("Custmoer id is : "+customerId);
	}

}