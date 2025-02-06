class Main2{
	public static void main(String[] args){
		Customer c1 = new Customer("Kushagra Sharma", 423);
		Customer c2 = new Customer("Naman Agarwal", 564);
		
		
		Product p1 = new Product("Maggi", 12);
		Product p2 = new Product("Handwash", 30);
		Product p3 = new Product("Television", 8000);
		Product p4 = new Product("Refridgerator", 10000);
		
		c1.addProduct(p1);
		c1.addProduct(p3);
		
		c2.addProduct(p2);
		c2.addProduct(p4);
		
		BillGenerator bg1 = new BillGenerator(c1);
		BillGenerator bg2 = new BillGenerator(c2);
		
		bg1.generateBill();
		bg2.generateBill();
	}

}