class Main{
	public static void main(String[] args){
		Customer c1 = new Customer("Kushagra Sharma");
		
		Order o1 = new Order(c1.name);
		Order o2 = new Order(c1.name);
		
		Product p1 = new Product("Maggi", 12);
		Product p2 = new Product("Detergent", 40);
		Product p3 = new Product("Bottle", 100);
		Product p4 = new Product("Keyboard", 1000);
		
		o1.addProduct(p1);
		o1.addProduct(p3);
		
		o2.addProduct(p2);
		o2.addProduct(p4);
		
		c1.placeOrder(o1);
		c1.placeOrder(o2);
		
		c1.showOrders();
	}

}