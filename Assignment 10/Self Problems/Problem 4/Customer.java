import java.util.*;
class Customer{
	String name;
	List<Order> orders;
	
	Customer(String name){
		this.name = name;
		orders = new ArrayList<>();
	}
	
	public void placeOrder(Order o){
		orders.add(o);
		System.out.println("order has been placed by cutomer : "+o.name);
	}
	
	public void showOrders(){
		System.out.println("Orders by customer "+name+" are :");
		for(int i=0;i<orders.size();i++){
			System.out.println("Order Number : "+(i+1)+" has following products :");
			for(int j=0;j<orders.get(i).products.size();j++)
				System.out.println(orders.get(i).products.get(j).name+" Price : "+orders.get(i).products.get(j).price);
		}
	}
}