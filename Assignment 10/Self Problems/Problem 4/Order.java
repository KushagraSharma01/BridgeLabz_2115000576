import java.util.*;
class Order{
	String name;
	List<Product> products;
	
	Order(String name){
		this.name = name;
		products = new ArrayList();
	}
	
	public void addProduct(Product p ){
		products.add(p);
		System.out.println("Product "+p.name+" has been added");
	}
	
	public void showProducts(){
		System.out.println("Products added in this order by customer "+name+" are :");
		for(int i=0;i<products.size();i++)
			System.out.println(products.get(i).name+" Price : "+products.get(i).price);
	}
}