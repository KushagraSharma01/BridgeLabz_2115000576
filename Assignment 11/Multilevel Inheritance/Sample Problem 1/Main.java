class Main{
	public static void main(String[] args){
		ShippedOrder sh1 = new ShippedOrder(1214, "05-02-2025", 4255366);
	
		DeliveredOrder dv1 = new DeliveredOrder(1265, "05-02-2025", 536322, "07-02-2025");
		
		sh1.getOrderStatus();
		dv1.getOrderStatus();
	}

}