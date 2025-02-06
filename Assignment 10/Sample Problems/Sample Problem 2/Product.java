import java.util.*;
class Product{
	String name;
	int price;
	
	Product(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	public void displayDetails(){
		System.out.println("Product name is : "+name);
		System.out.println("Price of the product is : "+price);
	}
}